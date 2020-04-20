package com.adca.domain.usecaseContract

import com.adca.domain.model.PlayerEntity

interface SavePlayerContract {
    suspend fun savePlayer(player: PlayerEntity)
}