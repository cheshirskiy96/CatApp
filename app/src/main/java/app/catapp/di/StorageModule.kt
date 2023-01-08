package app.catapp.di


import app.catapp.database.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class StorageModule {
    @Provides
     abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

}