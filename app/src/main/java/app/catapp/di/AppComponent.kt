package app.catapp.di


import android.content.Context
import app.catapp.MainActivity
import app.catapp.database.CatObject
import dagger.BindsInstance
import dagger.Component


@Component (modules = [NetworkModule::class,AppModule::class])
interface AppComponent{
    fun inject(activity: MainActivity)


}