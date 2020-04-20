package com.adca.data.persistance

import androidx.room.*
import com.adca.domain.model.PlayerEntity

@Dao
interface PlayerDao {

    @Query("SELECT * FROM Player WHERE id = :id")
    suspend fun getPlayerById(id: String): PlayerEntity

    @Query("SELECT * FROM Player")
    suspend fun getAllPlayers(): List<PlayerEntity>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertPlayer(player: PlayerEntity)

    @Delete
    suspend fun deletePlayer(player: PlayerEntity)

    @Update(onConflict = OnConflictStrategy.ABORT)
    suspend fun updatePlayer(player: PlayerEntity)

    @Query("DELETE FROM Player")
    fun deleteAllUsers()
}