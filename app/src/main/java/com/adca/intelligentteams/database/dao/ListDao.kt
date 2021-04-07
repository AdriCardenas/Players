package com.adca.intelligentteams.database.dao

import androidx.room.*
import com.adca.intelligentteams.database.model.ListPlayersEntity

@Dao
interface ListDao {
    @Query("SELECT * FROM List")
    suspend fun getAllLists(): List<ListPlayersEntity>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertList(listPlayers: ListPlayersEntity)

    @Delete
    suspend fun deleteList(listPlayers: ListPlayersEntity)

    @Update(onConflict = OnConflictStrategy.ABORT)
    suspend fun updateList(listPlayers: ListPlayersEntity)

    @Query("DELETE FROM List")
    fun deleteAllUsers()
}