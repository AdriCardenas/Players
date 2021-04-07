package com.adca.data.repository

import com.adca.data.source.PersistanceSource
import com.adca.domain.contract.PlayerRepositoryContract
import com.adca.domain.model.Player

class PlayerRepository(private val dataSource: PersistanceSource) :
    PlayerRepositoryContract {

    override suspend fun getPlayersFromList(id: String): List<Player> {
        return dataSource.getPlayerFromList(id)
    }

    override suspend fun saveNewPlayer(player: Player) {
        dataSource.saveNewPlayer(player)
    }

}
