package app.catapp.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides

@Module(includes =[SharedPreferencesStorage::class, NetworkModule::class] )
class AppModule {
        @Component.Factory
        interface Factory {
            fun create(@BindsInstance context: Context): AppComponent
        }


}