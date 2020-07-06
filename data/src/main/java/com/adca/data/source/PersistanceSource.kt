package com.adca.data.source

import com.adca.domain.model.ListEntity
import com.adca.domain.model.PlayerEntity

interface PersistanceSource {
    suspend fun getPlayerFromList(id:String): List<PlayerEntity>
    suspend fun saveNewPlayer(player: PlayerEntity)

    suspend fun saveNewList(list: ListEntity)
}