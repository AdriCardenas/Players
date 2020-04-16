package com.adca.domain.repository.contract

import com.adca.domain.model.PlayerEntity

interface PlayerRepositoryContract {
    fun getPlayers(): List<PlayerEntity>
    fun saveNewPlayer(player: PlayerEntity)
}