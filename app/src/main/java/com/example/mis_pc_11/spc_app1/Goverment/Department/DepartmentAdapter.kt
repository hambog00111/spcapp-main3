package com.example.mis_pc_11.spc_app1.Goverment.Department

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.mis_pc_11.spc_app1.R



class DepartmentAdapter(var mcontext: Context, var resource:Int, var items:List<DepartmentModel>)
    : ArrayAdapter<DepartmentModel>( mcontext , resource , items ) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


        val layoutInflater : LayoutInflater = LayoutInflater.from(mcontext)

        val view : View = layoutInflater.inflate(resource , null )
        val office : TextView = view.findViewById(R.id.nav_office)
        val officename: TextView = view.findViewById(R.id.nav_office_name)
        val departmenthead: TextView = view.findViewById(R.id.nav_department_head)

        val person : DepartmentModel = items[position]

        office.text = person.ivoffice
        officename.text = person.ivofficename
        departmenthead.text = person.ivdepartment



        return view
    }
}
