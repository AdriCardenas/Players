package com.adca.data.persistance

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.adca.data.source.PlayerPersistanceSource
import com.adca.domain.model.PlayerEntity

@Database(entities = [PlayerEntity::class], version = 1)
abstract class PlayerDatabase : RoomDatabase(), PlayerPersistanceSource {

    abstract fun playerDao(): PlayerDao

    companion object {
        @Volatile
        private var INSTANCE: PlayerDatabase? = null

        fun getInstance(context: Context): PlayerDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                PlayerDatabase::class.java, "PlayerTeams.db"
            )
                .build()
    }

    override suspend fun getPersistedPlayers(): List<PlayerEntity> {
        return playerDao().getAllPlayers()
    }

    override suspend fun saveNewPlayer(player: PlayerEntity) {
        playerDao().insertPlayer(player)
    }
}