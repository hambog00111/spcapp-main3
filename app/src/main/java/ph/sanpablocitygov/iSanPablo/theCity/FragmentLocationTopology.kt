package ph.sanpablocitygov.iSanPablo.theCity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ph.sanpablocitygov.iSanPablo.R


class FragmentLocationTopology : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_location_layout, container, false)


        return view
    }

    }