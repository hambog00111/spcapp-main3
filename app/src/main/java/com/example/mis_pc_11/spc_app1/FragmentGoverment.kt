package com.example.mis_pc_11.spc_app1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mis_pc_11.spc_app1.DepartmentAdministrative.FragmentAdministrative

class FragmentGoverment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_goverment_layout, null)

        val rdbtn = view?.findViewById<Button>(R.id.btn_administrative)
        rdbtn?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentAdministrative()).commit()
        }

        return view




    }


}