package id.arieridwan.androidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textNama = findViewById(R.id.txtNama) as EditText
        val buttonSubmit = findViewById(R.id.btnSubmit) as Button
        buttonSubmit.setOnClickListener {
            view -> Snackbar.make(view,"Hi dude, i'm " + textNama.text,Snackbar.LENGTH_LONG).show()
        }
    }
}
