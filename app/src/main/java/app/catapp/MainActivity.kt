package app.catapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.catapp.di.MyApplication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.get().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}