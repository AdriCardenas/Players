package com.adca.data.persistance

import androidx.room.*
import com.adca.domain.model.ListEntity
import com.adca.domain.model.PlayerEntity

@Dao
interface ListDao {
    @Query("SELECT * FROM List")
    suspend fun getAllLists(): List<ListEntity>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertList(list: ListEntity)

    @Delete
    suspend fun deleteList(list: ListEntity)

    @Update(onConflict = OnConflictStrategy.ABORT)
    suspend fun updateList(list: ListEntity)

    @Query("DELETE FROM List")
    fun deleteAllUsers()
}