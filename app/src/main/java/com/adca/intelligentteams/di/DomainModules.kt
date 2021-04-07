package com.adca.intelligentteams.di

import com.adca.domain.usecaseContract.GetPlayersFromListUseCase
import com.adca.domain.usecaseContract.SavePlayerUseCase
import com.adca.presentation.usecases.GetPlayersFromListUseCaseImpl
import com.adca.presentation.usecases.SavePlayerUseCaseImpl
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