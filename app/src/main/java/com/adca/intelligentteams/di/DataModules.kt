package com.adca.intelligentteams.di

import com.adca.intelligentteams.database.AppDatabase
import com.adca.data.repository.PlayerRepository
import com.adca.data.source.PersistanceSource
import com.adca.domain.contract.PlayerRepositoryContract
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val dataModules = module {
    single<PlayerRepositoryContract> {
        PlayerRepository(
            dataSource = get()
        )
    }

    single<PersistanceSource> {
        AppDatabase.getInstance(androidApplication())
    }
}