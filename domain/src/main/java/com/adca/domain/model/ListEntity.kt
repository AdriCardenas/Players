package com.adca.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "List")
data class ListEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String
)