package com.adca.intelligentteams.di

import com.adca.domain.usecases.GetPlayers
import com.adca.domain.usecases.SavePlayer
import org.koin.dsl.module

val useCaseModules = module {
    single {
        GetPlayers(
            repository = get()
        )
    }

    single {
        SavePlayer(
            repository = get()
        )
    }
}