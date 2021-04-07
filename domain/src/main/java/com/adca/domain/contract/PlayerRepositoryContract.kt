package com.adca.domain.contract

import com.adca.domain.model.Player

interface PlayerRepositoryContract {

    suspend fun getPlayersFromList(id:String): List<Player>
    suspend fun saveNewPlayer(player: Player)

}