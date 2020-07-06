package com.adca.domain.usecases

import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.PlayerEntity
import com.adca.domain.usecaseContract.SavePlayerUseCase

class SavePlayerUseCaseImpl(private val repository: PlayerRepositoryContract) :SavePlayerUseCase {

    override suspend fun invoke(player: PlayerEntity) = repository.saveNewPlayer(player)

}
