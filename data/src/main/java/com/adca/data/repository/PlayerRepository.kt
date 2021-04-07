package com.adca.data.repository

import com.adca.data.source.PersistanceSource
import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.PlayerEntity

class PlayerRepository(private val dataSource: PersistanceSource) :
    PlayerRepositoryContract {

    override suspend fun getPlayersFromList(id: String): List<PlayerEntity> {
        return dataSource.getPlayerFromList(id)
    }

    override suspend fun saveNewPlayer(player: PlayerEntity) {
        dataSource.saveNewPlayer(player)
    }

}
