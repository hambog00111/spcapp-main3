package com.example.mis_pc_11.spc_app1

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mis_pc_11.spc_app1.Links.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import android.widget.Button as Button1


@Suppress("UNREACHABLE_CODE", "PLUGIN_WARNING")
class FragmentHome : Fragment() {


//
//
//var images: Array<Int> = arrayOf(R.drawable.slake0,R.drawable.slake2,R.drawable.slake1)
//
//    var adapter: PagerAdapter = SliderAdapater(this.activity!!.applicationContext, images)



    //@SuppressLint("InflateParams")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home_layout_2, null)

        val btncsc = view?.findViewById<android.widget.Button>(R.id.btn_home_csc)
        btncsc?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeCSC()).commit()
        }
        val btnphiljob = view?.findViewById<android.widget.Button>(R.id.btn_home_phil_job)
        btnphiljob?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomePhilJobNet()).commit()
        }
        val btnbplo = view?.findViewById<android.widget.Button>(R.id.btn_home_bplo)
        btnbplo?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeBPLO()).commit()
        }
        val btnbusinesstax = view?.findViewById<android.widget.Button>(R.id.btn_home_business_tax)
        btnbusinesstax?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeBusinessTax()).commit()
        }
        val btnfranchisetax = view?.findViewById<android.widget.Button>(R.id.btn_home_franchise)
        btnfranchisetax?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeFranchiseTax()).commit()
        }
        val btnreal = view?.findViewById<android.widget.Button>(R.id.btn_home_real)
        btnreal?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeReal()).commit()
        }
        val btnmarket = view?.findViewById<android.widget.Button>(R.id.btn_home_market)
        btnmarket?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeMarket()).commit()
        }
        val btnbir = view?.findViewById<android.widget.Button>(R.id.btn_home_bir)
        btnbir?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeBIR()).commit()
        }
        val btndti = view?.findViewById<android.widget.Button>(R.id.btn_home_dti)
        btndti?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomeDTI()).commit()
        }
        val btnpassport = view?.findViewById<android.widget.Button>(R.id.btn_home_passport)
        btnpassport?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomePassport()).commit()
        }
        val btncio = view?.findViewById<android.widget.Button>(R.id.btn_fb_cio)
        btncio?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentFBCIO()).commit()
        }
        val textcio = view?.findViewById<TextView>(R.id.text_fb_cio)
        textcio?.setOnClickListener{
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentFBCIO()).commit()
        }
//        view_pager_image.adapter  = adapter


// Current date and time
//        val dateTime = LocalDateTime.now()
//        val time1 = view?.findViewById<TextView>(R.id.time)
//        time1?.text = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))
//
//// Curent date
//        val date = LocalDate.now()
//        println(date)
//
//// Current time
//        val time = LocalTime.now()
//        println(time)


        return view

    }




}