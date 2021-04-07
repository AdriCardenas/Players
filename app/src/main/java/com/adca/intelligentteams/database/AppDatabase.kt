package com.adca.intelligentteams.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.adca.intelligentteams.database.dao.ListDao
import com.adca.intelligentteams.database.dao.PlayerDao
import com.adca.data.source.PersistanceSource
import com.adca.domain.model.ListPlayers
import com.adca.domain.model.Player
import com.adca.intelligentteams.database.mapper.toPlayerEntity
import com.adca.intelligentteams.database.mapper.transform
import com.adca.intelligentteams.database.model.ListPlayersEntity
import com.adca.intelligentteams.database.model.PlayerEntity

@Database(entities = [PlayerEntity::class, ListPlayersEntity::class], version = 1)
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

    override suspend fun getPlayerFromList(id: String): List<Player> {
        return transform(playerDao().getPlayersByListId(id))
    }

    override suspend fun saveNewList(list: ListPlayers) {
        listDao().insertList(list.toPlayerEntity())
    }

    override suspend fun saveNewPlayer(player: Player) {
        playerDao().insertPlayer(player.toPlayerEntity())
    }
}