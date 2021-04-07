package com.adca.intelligentteams.di

import com.adca.domain.usecaseContract.GetPlayersFromListUseCase
import com.adca.domain.usecaseContract.SavePlayerUseCase
import com.adca.domain.usecases.GetPlayersFromListUseCaseImpl
import com.adca.domain.usecases.SavePlayerUseCaseImpl
import org.koin.dsl.module

val useCaseModules = module {
    single<GetPlayersFromListUseCase> {
        GetPlayersFromListUseCaseImpl(
            repository = get()
        )
    }

    single<SavePlayerUseCase> {
        SavePlayerUseCaseImpl(
            repository = get()
        )
    }
}