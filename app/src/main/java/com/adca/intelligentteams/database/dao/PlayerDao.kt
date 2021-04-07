package com.adca.intelligentteams.database.dao

import androidx.room.*
import com.adca.intelligentteams.database.model.PlayerEntity

@Dao
interface PlayerDao {

    @Query("SELECT * FROM Player WHERE list_id = :id")
    suspend fun getPlayersByListId(id: String): List<PlayerEntity>

    @Query("SELECT * FROM Player")
    suspend fun getAllPlayers(): List<PlayerEntity>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertPlayer(player: PlayerEntity)

    @Delete
    suspend fun deletePlayer(player: PlayerEntity)

    @Update(onConflict = OnConflictStrategy.ABORT)
    suspend fun updatePlayer(player: PlayerEntity)

    @Query("DELETE FROM Player")
    fun deleteAllPlayers()
}