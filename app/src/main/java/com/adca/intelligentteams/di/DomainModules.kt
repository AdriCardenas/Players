package com.adca.intelligentteams.di

import com.adca.domain.usecaseContract.GetPlayersContract
import com.adca.domain.usecaseContract.SavePlayerContract
import com.adca.domain.usecases.GetPlayers
import com.adca.domain.usecases.SavePlayer
import org.koin.dsl.module

val useCaseModules = module {
    single<GetPlayersContract> {
        GetPlayers(
            repository = get()
        )
    }

    single<SavePlayerContract> {
        SavePlayer(
            repository = get()
        )
    }
}