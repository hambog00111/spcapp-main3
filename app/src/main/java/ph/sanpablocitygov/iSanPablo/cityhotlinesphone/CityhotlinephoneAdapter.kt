package layout.ph.sanpablocitygov.iSanPablo.cityhotlines

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import ph.sanpablocitygov.iSanPablo.R

class CityhotlinephoneAdapter(var mcontext: Context, var resource:Int, var items:List<CityhotlinephoneModel>)
    : ArrayAdapter<CityhotlinephoneModel>(mcontext, resource, items){

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mcontext)

        val view: View = layoutInflater.inflate(resource, null)


        var phone: TextView = view.findViewById(R.id.title_cityhotline_number)

        var cityh : CityhotlinephoneModel = items[position]

        phone.text = cityh.ivcityhotlinephone

        return view
    }

}