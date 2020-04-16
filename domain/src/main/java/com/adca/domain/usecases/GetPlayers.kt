package com.adca.domain.usecases

import com.adca.domain.model.PlayerEntity
import com.adca.domain.repository.contract.PlayerRepositoryContract

class GetPlayers (private val repository: PlayerRepositoryContract){
    operator fun invoke():List<PlayerEntity> = repository.getPlayers()
}
