package com.adca.data.source

import com.adca.domain.model.PlayerEntity

interface PlayerPersistanceSource {
    fun getPersistedPlayers(): List<PlayerEntity>
    fun saveNewPlayer(player: PlayerEntity)
}