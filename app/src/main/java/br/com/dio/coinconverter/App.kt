package br.com.dio.coinconverter

import android.app.Application
import br.com.dio.coinconverter.data.di.DataModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
    }
}