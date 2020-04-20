package com.adca.data.repository

import com.adca.data.source.PlayerPersistanceSource
import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.PlayerEntity

class PlayerRepository(private val dataSource: PlayerPersistanceSource) :
    PlayerRepositoryContract {

    override suspend fun getPlayers(): List<PlayerEntity> {
        return dataSource.getPersistedPlayers()
    }

    override suspend fun saveNewPlayer(player: PlayerEntity) {
        dataSource.saveNewPlayer(player)
    }

}
