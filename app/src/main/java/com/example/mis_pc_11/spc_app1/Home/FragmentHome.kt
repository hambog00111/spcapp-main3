package com.example.mis_pc_11.spc_app1.Home

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import com.example.mis_pc_11.spc_app1.Links.*
import com.example.mis_pc_11.spc_app1.R
import android.widget.Button as Button1


@Suppress("UNREACHABLE_CODE", "PLUGIN_WARNING")
class FragmentHome : Fragment() {

    internal lateinit var  viewPagerHome: ViewPager
//    private var vv: VideoView? = null
//    private var mediacontroller: MediaController? = null
//    private var uri: Uri? = null
    internal lateinit var  viewPagerEvents: ViewPager
//    private var isContinuously = false
    //@SuppressLint("InflateParams")
    @SuppressLint("SetJavaScriptEnabled")
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
    val btngeps = view?.findViewById<android.widget.Button>(R.id.btn_home_philgeps)
    btngeps?.setOnClickListener{
        activity!!.supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHomePhilGEPS()).commit()
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

        viewPagerHome = view?.findViewById<View>(R.id.home_viewpager) as ViewPager
        val adapterhome = ViewPageAdapterHome(requireContext())
        viewPagerHome.adapter = adapterhome

        viewPagerEvents = view.findViewById<View>(R.id.events_viewpager) as ViewPager
        val adapterevents = ViewPagerAdapterEvent(requireContext())
        viewPagerEvents.adapter = adapterevents

//        val uriPath = R.raw.pplaza  //update package name
//        vv = view.findViewById(R.id.video_home2) as VideoView
//        mediacontroller = MediaController(requireContext())
//        mediacontroller!!.setAnchorView(vv)
//        uri = Uri.parse(uriPath.toString())
//        vv!!.setVideoURI(uri)
//        vv!!.requestFocus()
//        vv!!.start()
//        vv!!.setOnCompletionListener {
//            if (isContinuously) {
//                vv!!.start()
//            }
//        }
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