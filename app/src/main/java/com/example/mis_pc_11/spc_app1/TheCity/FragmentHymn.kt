package com.example.mis_pc_11.spc_app1.TheCity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mis_pc_11.spc_app1.R
import com.example.mis_pc_11.spc_app1.TheCity.Barangay.FragmentBarangay
import com.example.mis_pc_11.spc_app1.TheCity.SanPablenos.FragmentSanPablo

class FragmentHymn : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_hymn_layout, container, false)


        return  view

    }
}