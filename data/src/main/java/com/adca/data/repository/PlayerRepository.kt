package com.adca.data.repository

import com.adca.domain.repository.contract.PlayerRepositoryContract
import com.adca.data.source.PlayerPersistanceSource
import com.adca.domain.model.PlayerEntity

class PlayerRepository(private val dataSource: PlayerPersistanceSource) :
    PlayerRepositoryContract {

    override fun getPlayers(): List<PlayerEntity> {
        return dataSource.getPersistedPlayers()
    }

    override fun saveNewPlayer(player: PlayerEntity) {
        dataSource.saveNewPlayer(player)
    }

}
