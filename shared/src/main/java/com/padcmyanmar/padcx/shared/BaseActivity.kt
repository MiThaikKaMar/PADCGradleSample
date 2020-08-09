package com.padcmyanmar.padcx.shared

import android.view.Menu
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    override fun onContextMenuClosed(menu: Menu) {
        super.onContextMenuClosed(menu)
    }
}