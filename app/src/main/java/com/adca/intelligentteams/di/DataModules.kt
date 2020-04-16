package com.adca.intelligentteams.di

import com.adca.data.persistance.TeamDatabase
import com.adca.data.repository.PlayerRepository
import org.koin.dsl.module

val dataModules = module {
    single {
        PlayerRepository(
            dataSource = get()
        )
    }
}

val teamDatabase = module {
    single {
        TeamDatabase()
    }
}