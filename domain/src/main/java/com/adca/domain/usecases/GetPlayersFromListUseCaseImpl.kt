package com.adca.domain.usecases

import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.PlayerEntity
import com.adca.domain.usecaseContract.GetPlayersFromListUseCase

class GetPlayersFromListUseCaseImpl(private val repository: PlayerRepositoryContract) : GetPlayersFromListUseCase {

    override suspend fun invoke(id:String): List<PlayerEntity> = repository.getPlayersFromList(id)

}
