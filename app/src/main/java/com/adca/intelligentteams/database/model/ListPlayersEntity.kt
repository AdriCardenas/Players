package com.adca.intelligentteams.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "List")
data class ListPlayersEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String
)