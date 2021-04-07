package com.adca.domain.contract

import com.adca.domain.model.PlayerEntity

interface PlayerRepositoryContract {

    suspend fun getPlayersFromList(id:String): List<PlayerEntity>
    suspend fun saveNewPlayer(player: PlayerEntity)

}