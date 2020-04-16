package com.adca.intelligentteams

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.adca.intelligentteams.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class IntelligentTeamsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@IntelligentTeamsApplication)
            modules(modules = appModules)

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }

    }
}