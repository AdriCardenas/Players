package com.adca.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Player")
data class PlayerEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String
)