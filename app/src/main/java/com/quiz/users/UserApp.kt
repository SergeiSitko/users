package com.quiz.users

import android.app.Application
import com.quiz.users.di.apiModule
import com.quiz.users.di.viewModels
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class UserApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@UserApp)
            modules(listOf(viewModels, apiModule))
        }
    }
}