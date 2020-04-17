package com.adca.intelligentteams.di

import com.adca.data.persistance.TeamDatabase
import com.adca.data.repository.PlayerRepository
import com.adca.data.source.PlayerPersistanceSource
import com.adca.domain.repository.contract.PlayerRepositoryContract
import org.koin.dsl.module

val dataModules = module {
    single<PlayerRepositoryContract> {
        PlayerRepository(
            dataSource = get()
        )
    }

    single<PlayerPersistanceSource> {
        TeamDatabase()
    }
}