package com.adca.data.source

import com.adca.domain.model.ListPlayers
import com.adca.domain.model.Player

interface PersistanceSource {
    suspend fun getPlayerFromList(id:String): List<Player>
    suspend fun saveNewPlayer(player: Player)

    suspend fun saveNewList(list: ListPlayers)
}