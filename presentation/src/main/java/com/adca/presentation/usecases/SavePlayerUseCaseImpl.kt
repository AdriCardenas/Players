package com.adca.presentation.usecases

import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.Player
import com.adca.domain.usecaseContract.SavePlayerUseCase

class SavePlayerUseCaseImpl(private val repository: PlayerRepositoryContract) : SavePlayerUseCase {

    override suspend fun invoke(player: Player) = repository.saveNewPlayer(player)

}
