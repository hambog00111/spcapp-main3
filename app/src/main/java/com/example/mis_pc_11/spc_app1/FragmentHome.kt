package com.example.mis_pc_11.spc_app1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentHome : Fragment() {


//
//
//var images: Array<Int> = arrayOf(R.drawable.slake0,R.drawable.slake2,R.drawable.slake1)
//
//    var adapter: PagerAdapter = SliderAdapater(this.activity!!.applicationContext, images)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home_layout_2, null)


//        view_pager_image.adapter  = adapter


        return view




    }

}