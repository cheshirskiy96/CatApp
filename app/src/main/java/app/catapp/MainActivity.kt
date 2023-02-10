package app.catapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.catapp.di.App
import app.catapp.di.AppComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}