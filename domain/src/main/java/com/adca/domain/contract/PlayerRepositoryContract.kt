package com.adca.domain.contract

import com.adca.domain.model.PlayerEntity

interface PlayerRepositoryContract {
    suspend fun getPlayers(): List<PlayerEntity>
    suspend fun saveNewPlayer(player: PlayerEntity)
}