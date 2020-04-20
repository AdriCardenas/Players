package com.adca.domain.usecaseContract

import com.adca.domain.model.PlayerEntity

interface GetPlayersContract {
    suspend fun getPlayers(): List<PlayerEntity>
}