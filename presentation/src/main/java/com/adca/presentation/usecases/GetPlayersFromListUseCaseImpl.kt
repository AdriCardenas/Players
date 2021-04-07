package com.adca.presentation.usecases

import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.Player
import com.adca.domain.usecaseContract.GetPlayersFromListUseCase


class GetPlayersFromListUseCaseImpl(private val repository: PlayerRepositoryContract) :
    GetPlayersFromListUseCase {

    override suspend fun invoke(id:String): List<Player> = repository.getPlayersFromList(id)

}
