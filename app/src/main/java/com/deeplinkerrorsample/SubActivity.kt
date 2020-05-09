package com.deeplinkerrorsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.navArgs
import com.google.android.material.snackbar.Snackbar

class SubActivity : AppCompatActivity() {

    private val args: SubActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val name = "Got ${args.name}"
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}
