package com.example.mis_pc_11.spc_app1.TheCity.Barangay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.mis_pc_11.spc_app1.R

class BarangayAdapter(var mcontext: Context , var resource:Int,var items:List<BarangayModel>)
    : ArrayAdapter<BarangayModel>( mcontext , resource , items ){



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mcontext)

        val view : View = layoutInflater.inflate(resource , null )
        val title : TextView = view.findViewById(R.id.title_barangay)
        var district: TextView = view.findViewById(R.id.district_brangay)
        var code : TextView = view.findViewById(R.id.code_barangay)
        var chairman : TextView = view.findViewById(R.id.chairman_barangay)
        var contact : TextView = view.findViewById(R.id.contact_barangay)


        var person : BarangayModel = items[position]

        title.text = person.ivtitle
        district.text = person.ivdistrict
        code.text = person.ivcode
        chairman.text = person.ivchairman
        contact.text = person.ivcontact


        return view
    }

}

