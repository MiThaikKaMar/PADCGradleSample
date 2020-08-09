package com.padcmyanmar.padcx.padcgradlesample

import android.os.Bundle
import com.padcmyanmar.padcx.shared.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello.text=BuildConfig.BASE_URL
    }
}
