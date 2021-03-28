package com.example.integration

import android.app.Application
import com.example.core.provides
import com.example.core.proxyOf
import com.example.modules.module.ModuleProxy
import com.example.integration.modules.authGateway
import com.example.integration.modules.configGateway
import com.example.integration.modules.homeGateway

@Suppress("unused")
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        provides {
            proxyOf<ModuleProxy>(
                configGateway,
                homeGateway,
                authGateway
            )
        }
    }
}