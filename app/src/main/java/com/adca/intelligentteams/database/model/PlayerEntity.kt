package com.adca.intelligentteams.database.model

import androidx.room.*

@Entity(tableName = "Player",
    foreignKeys = [ForeignKey(entity = ListPlayersEntity::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("list_id"),
        onDelete = ForeignKey.NO_ACTION)]
)
data class PlayerEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    @Embedded val skill: SkillEntity = SkillEntity(),
    @ColumnInfo(name = "list_id")
    val listId:Int
)