package app.catapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.viewmodel.viewModelFactory
import app.catapp.R
import app.catapp.database.CatObject
import app.catapp.di.AppComponent
import app.catapp.di.MyApplication
import app.catapp.viewmodels.CatListViewmodel
import javax.inject.Inject

@Inject
lateinit var catListViewmodel: CatListViewmodel

class CatMainScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.get().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_main_screen)
//        supportFragmentManager.beginTransaction()
//            .add(R.id.fragment_holder, EnterDetailsFragment())
//            .commit()

    }
}