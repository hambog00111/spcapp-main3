package com.example.mis_pc_11.spc_app1.TheCity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mis_pc_11.spc_app1.R
import com.example.mis_pc_11.spc_app1.TheCity.Barangay.FragmentBarangay

class FragmentHistory : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_history_layout, container, false)


        val rdbtn1 = view.findViewById<Button>(R.id.btn_cityhistory)
        rdbtn1?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentTheCity()).commit()
        }

        val rdbtn2 = view.findViewById<Button>(R.id.btn_sanpabloshistory)
        rdbtn2?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentSanPablo()).commit()
        }

        val rdbtn3 = view.findViewById<Button>(R.id.btn_barangayhistory)
        rdbtn3?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container,
                FragmentBarangay()
            ).commit()
        }

        val rdbtn4 = view.findViewById<Button>(R.id.btn_hymnhistory)
        rdbtn4?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHymn()).commit()
        }

        return  view

    }
}