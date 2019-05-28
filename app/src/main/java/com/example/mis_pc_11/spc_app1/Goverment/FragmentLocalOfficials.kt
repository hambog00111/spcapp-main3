package com.example.mis_pc_11.spc_app1.Goverment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mis_pc_11.spc_app1.R

class FragmentLocalOfficials: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_local_officials, container, false)

        return view
    }
}