package com.adca.data.persistance

import com.adca.data.source.PlayerPersistanceSource
import com.adca.domain.model.PlayerEntity

class TeamDatabase : PlayerPersistanceSource {

    private val players = arrayListOf<PlayerEntity>()

    override fun getPersistedPlayers(): List<PlayerEntity> {
        return players;
    }

    override fun saveNewPlayer(player: PlayerEntity) {
        players.add(player)
    }

}