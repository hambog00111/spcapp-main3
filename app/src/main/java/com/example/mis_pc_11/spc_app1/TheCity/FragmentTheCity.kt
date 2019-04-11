package com.example.mis_pc_11.spc_app1.TheCity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mis_pc_11.spc_app1.R

class FragmentTheCity : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_thecity_layout, null)


        val rdbtn1 = view.findViewById<Button>(R.id.btn_historycity)
        rdbtn1?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHistory()).commit()
        }

        val rdbtn2 = view.findViewById<Button>(R.id.btn_sanpablosscity)
        rdbtn2?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentSanPablo()).commit()
        }

        val rdbtn3 = view.findViewById<Button>(R.id.btn_barangaycity)
        rdbtn3?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentBarangay()).commit()
        }

        val rdbtn4 = view.findViewById<Button>(R.id.btn_hymncity)
        rdbtn4?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHymn()).commit()
        }



        return  view

    }
}