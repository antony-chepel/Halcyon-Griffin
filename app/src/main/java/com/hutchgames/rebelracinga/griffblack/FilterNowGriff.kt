package com.hutchgames.rebelracinga.griffblack

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hutchgames.rebelracinga.R
import com.hutchgames.rebelracinga.griddwhite.MainGriffScreen
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.XVGHHJSADKQWKDQKW
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.ODQWIIDOQWDOPSAKD

class FilterNowGriff : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_me_now)

        val kwdqldlqwd = getSharedPreferences("SP", MODE_PRIVATE)
        val wqtydqhdhshd: String? = kwdqldlqwd.getString(XVGHHJSADKQWKDQKW, "null")
        val nsdandjjsadjasj: String? = kwdqldlqwd.getString(ODQWIIDOQWDOPSAKD, "null")
        if (wqtydqhdhshd!!.contains("tdb2")){
            Log.d("zero_filter", "nameWeb")
            Intent(this, GriffWeb::class.java)
                .also { startActivity(it) }
            finish()
        }
        else if(nsdandjjsadjasj!!.contains("tdb2")){
            Log.d("zero_filter", "deepWeb")
            Intent(this, GriffWeb::class.java)
                .also { startActivity(it) }
            finish()
        }
        else{
            Log.d("zero_filter", "toGame")
            Intent(this, MainGriffScreen::class.java)
                .also { startActivity(it) }
            finish()
        }

    }
}