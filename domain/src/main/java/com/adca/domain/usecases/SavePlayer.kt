package com.adca.domain.usecases

import com.adca.domain.model.PlayerEntity
import com.adca.domain.repository.contract.PlayerRepositoryContract

class SavePlayer(private val repository: PlayerRepositoryContract) {
    operator fun invoke(player: PlayerEntity) = repository.saveNewPlayer(player)
}
