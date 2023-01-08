package app.catapp.di


import app.catapp.MainActivity
import app.catapp.ui.CatMainScreen
import dagger.Component
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {
    @Provides
    fun inject(activity: CatMainScreen)

    @Provides
    fun inject(activity: MainActivity)
}