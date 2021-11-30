package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_main)

        //body
        val click = findViewById<CardView>(R.id.ancient_his_button)


        click.setOnClickListener{
            startActivity(Intent(this,MainActivityAncient::class.java))

            val click = findViewById<CardView>(R.id.medival_history_button)

            click.setOnClickListener{
                startActivity(Intent(this,MainActivityAncient::class.java))



                }



       }
    }
}