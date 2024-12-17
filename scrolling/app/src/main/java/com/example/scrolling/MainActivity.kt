package com.example.scrolling

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scrolling)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val primeraPers: ImageView = findViewById(R.id.primera_pers)
        Glide.with(this)
            .load("https://cdn-4.motorsport.com/images/amp/YBeOLnn2/s1000/fernando-alonso-aston-martin-f.jpg")
            .into(primeraPers)

        val segundaPers: ImageView = findViewById(R.id.segunda_pers)
        Glide.with(this)
            .load("https://estaticos-cdn.prensaiberica.es/clip/2766003b-378f-42f1-9828-c24ec1d5289f_alta-libre-aspect-ratio_default_0.jpg")
            .into(segundaPers)

        val terceraPers: ImageView = findViewById(R.id.tercera_pers)
        Glide.with(this)
            .load("https://cdn-6.motorsport.com/images/amp/6D1pJOV0/s1000/lewis-hamilton-mercedes-amg-f1.jpg")
            .into(terceraPers)

        val cuartaPers: ImageView = findViewById(R.id.cuarta_pers)
        Glide.with(this)
            .load("https://phantom-marca.unidadeditorial.es/abef88622926e21640ca4da3b26df56d/resize/828/f/jpg/assets/multimedia/imagenes/2024/06/03/17174129331109.jpg")
            .into(cuartaPers)

        val boton1 = findViewById<View>(R.id.myButton)
        val boton2 = findViewById<View>(R.id.myButton2)
        val boton3 = findViewById<View>(R.id.myButton3)
        val boton4 = findViewById<View>(R.id.myButton4)

        boton1.setOnClickListener {
            // Abrir pagina de web wikipedia
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Fernando_Alonso"))
            startActivity(intent)
        }

        boton2.setOnClickListener {
            // Abrir pagina de web wikipedia
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Max_Verstappen"))
            startActivity(intent)
        }

        boton3.setOnClickListener {
            // Abrir pagina de web wikipedia
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Lewis_Hamilton"))
            startActivity(intent)
        }

        boton4.setOnClickListener {
            // Abrir pagina de web wikipedia
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Esteban_Ocon"))
            startActivity(intent)
        }
    }
}