package com.adca.data.persistance

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.adca.data.source.PersistanceSource
import com.adca.domain.model.ListEntity
import com.adca.domain.model.PlayerEntity

@Database(entities = [PlayerEntity::class, ListEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(), PersistanceSource {

    abstract fun playerDao(): PlayerDao
    abstract fun listDao(): ListDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "PlayerTeams.db"
            )
                .build()
    }

    override suspend fun getPlayerFromList(id: String): List<PlayerEntity> {
        return playerDao().getPlayersByListId(id)
    }

    override suspend fun saveNewList(list: ListEntity) {
        listDao().insertList(list)
    }

    override suspend fun saveNewPlayer(player: PlayerEntity) {
        playerDao().insertPlayer(player)
    }
}