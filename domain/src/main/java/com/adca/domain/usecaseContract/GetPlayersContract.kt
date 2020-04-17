package com.adca.domain.usecaseContract

import com.adca.domain.model.PlayerEntity

interface GetPlayersContract {
    fun getPlayers(): List<PlayerEntity>
}