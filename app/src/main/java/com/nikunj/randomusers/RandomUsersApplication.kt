package com.nikunj.randomusers

import android.app.Application
import com.nikunj.randomusers.presentation.di.dataModule
import com.nikunj.randomusers.presentation.di.domainModule
import com.nikunj.randomusers.presentation.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class RandomUsersApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        startKoin {
            androidContext(this@RandomUsersApplication)
            modules(listOf(presentationModule, domainModule, dataModule))
        }
    }
}