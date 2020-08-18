package com.kakao.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kakao.fragments.AddressFragment
import com.kakao.fragments.NameFragment
import com.kakao.fragments.PhoneNumFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "이름"
            1 -> "휴대폰번호"
            else -> "거주지"
        }
/*
        if (position == 0) {
            return "이름"
        } else if (position == 1) {
            return "휴대폰번호"
        } else {
            return "거주지"
        }
 */
//        return super.getPageTitle(position)
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> NameFragment()
            1 -> PhoneNumFragment()
            else -> AddressFragment()
        }
/*
        if (position == 0) {
            return NameFragment()
        } else if (position == 1) {
            return PhoneNumFragment()
        } else {
            return AddressFragment()
        }
 */
    }

    override fun getCount(): Int {
        return 3
    }

}