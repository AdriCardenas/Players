package com.adca.data.source

import com.adca.domain.model.PlayerEntity

interface PlayerPersistanceSource {
    suspend fun getPersistedPlayers(): List<PlayerEntity>
    suspend fun saveNewPlayer(player: PlayerEntity)
}