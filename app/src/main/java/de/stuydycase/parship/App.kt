package de.stuydycase.parship

import android.app.Application
import android.view.KeyEvent
import android.view.View
import android.view.View.OnUnhandledKeyEventListener
import androidx.annotation.RequiresApi
import androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat


class App : Application() {
    companion object {
        var instance: App? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}