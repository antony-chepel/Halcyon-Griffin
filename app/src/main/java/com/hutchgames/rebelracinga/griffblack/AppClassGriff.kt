package com.hutchgames.rebelracinga.griffblack

import android.app.Application
import android.content.Context
import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AppClassGriff : Application() {
    companion object {
        const val KDFKIWEFIWEFIWEIF = "X3se2ZQpJWAhUh4XVCjhLA"
        const val JSJDHYUQWUDJSJQJD = "187df6f5-dc46-4738-a66f-0e79e983f589"

        val vbxbncmmkskkdwkqdkqwd = "http://halcyongriffin"
        val twqdtyusjajdjasjdkqw = ".xyz/apps.txt"

        var XBVCGHJKSDKQWKDKWQ: String? = ""
        var XVGHHJSADKQWKDQKW: String? = "c11"
        var ODQWIIDOQWDOPSAKD: String? = "d11"
        var TWYDIQWIODKSADMNASDSMK: String? = "check"

    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            hdhksfkewkfnnwekfwek(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(JSJDHYUQWUDJSJQJD)
    }

    private suspend fun hdhksfkewkfnnwekfwek(context: Context) {
        val advertisingInfo = GriffAdv(context)
        val idInfo = advertisingInfo.kskdjsnabndbsabdbwhqhd()

        val prefs = getSharedPreferences("SP", MODE_PRIVATE)
        val editor = prefs.edit()

        editor.putString(XBVCGHJKSDKQWKDKWQ, idInfo)
        editor.apply()
    }

}

class GriffAdv (context: Context) {
    private val adInfo = AdvertisingIdClient(context.applicationContext)

    suspend fun kskdjsnabndbsabdbwhqhd(): String =
        withContext(Dispatchers.IO) {
            adInfo.start()
            val adIdInfo = adInfo.info
            Log.d("getAdvertisingId = ", adIdInfo.id.toString())
            adIdInfo.id
        }
}