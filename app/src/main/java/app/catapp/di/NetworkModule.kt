package app.catapp.di

import app.catapp.database.CatObject
import app.catapp.network.NetworkService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@Module
class NetworkModule {
    @Provides
    fun provideResponce (): Retrofit {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient =OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
         return Retrofit.Builder()
            .baseUrl("https://api.thecatapi.com")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

}
