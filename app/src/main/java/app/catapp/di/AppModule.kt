package app.catapp.di

import app.catapp.network.NetworkService
import app.catapp.repository.CatsRepository
import app.catapp.repository.CatsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module (includes = [AppBindingModule::class] )
class AppModule

@Module
interface  AppBindingModule {
    @Binds
    fun bindCatRepository(catsRepositoryImpl: CatsRepositoryImpl): CatsRepository
    }