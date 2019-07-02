package ph.sanpablocitygov.iSanPablo.home

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.DownloadManager
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v4.content.ContextCompat.*
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_home_layout_2.*
import ph.sanpablocitygov.iSanPablo.R
import ph.sanpablocitygov.iSanPablo.links.*
import java.util.jar.Manifest

import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import kotlinx.android.synthetic.main.fragment_home_layout_2.view.*
import ph.sanpablocitygov.iSanPablo.home.BusinessPermit.FragmentBusinessPermit

@Suppress("UNREACHABLE_CODE", "PLUGIN_WARNING")
class FragmentHome : Fragment() {


    internal lateinit var viewPagerHome: ViewPager
    internal lateinit var viewPagerEvents: ViewPager
    //internal lateinit var downloadManager: DownloadManager
    //@SuppressLint("InflateParams")
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home_layout_2, null)

        viewPagerEvents = view.findViewById<View>(R.id.events_viewpager) as ViewPager
        val adapterevents = ViewPagerAdapterEvent(requireContext())
        viewPagerEvents.adapter = adapterevents

        viewPagerHome = view?.findViewById<View>(R.id.home_viewpager) as ViewPager
        val adapterhome = ViewPageAdapterHome(requireContext())
        viewPagerHome.adapter = adapterhome

        val btncsc = view.findViewById<Button>(R.id.btn_home_csc)
        btncsc?.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(
                R.id.frag_container,
                FragmentHomeCSC()
            ).commit()
        }
        val btnphiljob = view.findViewById<Button>(R.id.btn_home_phil_job)
        btnphiljob?.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(
                R.id.frag_container,
                FragmentHomePhilJobNet()
            ).commit()
        }

        val btngeps = view.findViewById<android.widget.Button>(R.id.btn_home_philgeps)
        btngeps?.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(
                R.id.frag_container,
                FragmentHomePhilGEPS()
            ).commit()
        }
        val btncio = view.findViewById<android.widget.Button>(R.id.btn_fb_cio)
        btncio?.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(
                R.id.frag_container,
                FragmentFBCIO()
            ).commit()
        }
        val textcio = view.findViewById<TextView>(R.id.text_fb_cio)
        textcio?.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(
                R.id.frag_container,
                FragmentFBCIO()
            ).commit()
        }
        val btnpermit = view.findViewById<TextView>(R.id.btn_business_permit)
        btnpermit?.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(
                R.id.frag_container,
                FragmentBusinessPermit()
            ).commit()
        }
        return view

    }
}
