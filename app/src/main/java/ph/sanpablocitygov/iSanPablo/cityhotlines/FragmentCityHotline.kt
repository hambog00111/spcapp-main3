package layout.ph.sanpablocitygov.iSanPablo.goverment

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import layout.ph.sanpablocitygov.iSanPablo.cityhotlines.CityhotlineAdapter
import layout.ph.sanpablocitygov.iSanPablo.cityhotlines.CityhotlineModel
import layout.ph.sanpablocitygov.iSanPablo.cityhotlines.CityhotlinephoneAdapter

import ph.sanpablocitygov.iSanPablo.R

class FragmentCityHotline : Fragment() {

    private lateinit var listView: ListView
    var cityhotline_name = arrayOf("San Pablo City Goverment", "San Pablo City Police", "Red Cross San Pablo", "San Pablo City Emergency Hospital","San Pablo General Hospital","City Disaster Risk Reduction Management Office","San Pablo Welfare and Development Office","Bureau of Fire Protection")


    @SuppressLint("RestrictedApi")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootview = inflater.inflate(R.layout.fragment_cityhotline_listview, null)

        listView = rootview.findViewById(R.id.listview_cityhotline)
        genList(listView)


        return rootview
    }

    fun genList(ls: ListView) {
        val lists: MutableList<CityhotlineModel> = mutableListOf<CityhotlineModel>()
        for (i: Int in 0 until cityhotline_name.size step 1) {
            lists.add(CityhotlineModel(cityhotline_name[i]))
        }

        val list = CityhotlineAdapter(requireContext(), R.layout.row_cityhot_lines, lists)
        ls.adapter = list

    }


}
