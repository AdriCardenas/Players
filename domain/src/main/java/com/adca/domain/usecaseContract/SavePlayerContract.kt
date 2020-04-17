package com.adca.domain.usecaseContract

import com.adca.domain.model.PlayerEntity

interface SavePlayerContract {
    fun savePlayer(player: PlayerEntity)
}