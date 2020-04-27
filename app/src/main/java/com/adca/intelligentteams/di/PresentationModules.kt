package com.adca.intelligentteams.di

import com.adca.presentation.contract.PlayerListContract
import com.adca.presentation.presenter.PlayerListPresenter
import org.koin.dsl.module

val presentationModules = module {
    factory<PlayerListContract.Presenter> { (view: PlayerListContract.View) -> PlayerListPresenter(get(), get(), view) }
}
