package com.adca.domain.usecaseContract

import com.adca.domain.model.PlayerEntity

interface SavePlayerUseCase {
    suspend fun invoke(player: PlayerEntity)
}