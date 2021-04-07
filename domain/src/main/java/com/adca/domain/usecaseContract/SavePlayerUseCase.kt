package com.adca.domain.usecaseContract

import com.adca.domain.model.Player


interface SavePlayerUseCase {
    suspend fun invoke(player: Player)
}