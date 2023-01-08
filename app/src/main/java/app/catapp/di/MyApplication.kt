package app.catapp.di

import android.app.Application
import android.os.UserManager
import dagger.Lazy
import dagger.Module
import javax.inject.Inject

@Module
open class MyApplication: Application() {
    @Inject
   lateinit var appComponent:Lazy <AppComponent>
   lateinit var storage: Lazy <AppComponent>
    }

