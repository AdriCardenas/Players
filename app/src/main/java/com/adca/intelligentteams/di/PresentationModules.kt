package com.adca.intelligentteams.di

import com.adca.presentation.viewmodel.PlayerViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModules = module {
    viewModel { PlayerViewModel(get(), get()) }
}
