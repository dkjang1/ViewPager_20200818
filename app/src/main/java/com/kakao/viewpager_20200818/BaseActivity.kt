package com.kakao.viewpager_20200818

import androidx.appcompat.app.AppCompatActivity

//STEP1:BaseActivity만들기
abstract class BaseActivity : AppCompatActivity() {
    val mContext = this
    abstract fun setupEvents()
    abstract fun setValues()
}