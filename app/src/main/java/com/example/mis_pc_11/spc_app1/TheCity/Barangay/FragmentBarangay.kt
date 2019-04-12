package com.example.mis_pc_11.spc_app1.TheCity.Barangay

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.mis_pc_11.spc_app1.R

class FragmentBarangay : Fragment() {

    lateinit var listView : ListView

    val brgys = arrayOf("I-A","I-B","I-C","II-A","II-B","II-C","II-D","II-E","II-F")
    val dists = arrayOf("1","1","1","1","1","1","1","1","1")
    val codes = arrayOf("1","2","3","4","5","6","7","8","9")
    val chairman = arrayOf("chingchong","mingmong","chingchong","mingmong","chingchong","mingmong","chingchong","mingmong","chingchong")
    val contact  = arrayOf("0909090999","111111111","0909090999","111111111","0909090999","111111111","0909090999","111111111","0909090999")
    @SuppressLint("RestrictedApi")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootview = inflater.inflate(R.layout.fragment_barangay, null)

        listView = rootview.findViewById(R.id.listview_barangay)
        ListBrgy(listView)


        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                val itemValue = listView.getItemAtPosition(position) as String

                Toast.makeText(
                    requireContext(),
                    "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG
                )
                    .show()
            }

        }


                return rootview
    }


    fun ListBrgy(lsView: ListView){
        val list = mutableListOf<BarangayModel>()
        for(i in 0 until brgys.size step 1){
            list.add(
                BarangayModel(
                    brgys[i],
                    dists[i],
                    codes[i],
                    chairman[i],
                    contact[i]
                )
            )
        }
        val adapter = BarangayAdapter(
            requireContext(),
            R.layout.row_barangay,
            list
        )
        lsView.adapter = adapter


    }
}





