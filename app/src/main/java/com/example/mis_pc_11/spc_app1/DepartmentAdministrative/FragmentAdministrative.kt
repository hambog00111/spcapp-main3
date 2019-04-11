package com.example.mis_pc_11.spc_app1.DepartmentAdministrative

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mis_pc_11.spc_app1.R

class FragmentAdministrative : Fragment() {

    val rdbtn : Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_department_administrative, null)

        val rdsbtn = view?.findViewById<Button>(R.id.btn_city_info)
        rdsbtn?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentCityInformationOffice()).commit()
        }

        return view




    }


}