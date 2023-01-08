package app.catapp.di

import android.content.Context
import app.catapp.database.Storage
import dagger.Module
import javax.inject.Inject

@Module
abstract class SharedPreferencesStorage @Inject constructor (context: Context): Storage {

}