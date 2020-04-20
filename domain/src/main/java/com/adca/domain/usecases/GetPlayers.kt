package com.adca.domain.usecases

import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.PlayerEntity
import com.adca.domain.usecaseContract.GetPlayersContract

class GetPlayers(private val repository: PlayerRepositoryContract) : GetPlayersContract {
    override suspend fun getPlayers(): List<PlayerEntity> = repository.getPlayers()
}
