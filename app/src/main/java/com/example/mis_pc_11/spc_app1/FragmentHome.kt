package com.example.mis_pc_11.spc_app1

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import android.widget.VideoView
import com.example.mis_pc_11.spc_app1.Disclosure.Disclosure1
import com.example.mis_pc_11.spc_app1.Links.Fragment_Home_CSC
import kotlinx.android.synthetic.main.fragment_home_layout_2.*
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

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home_layout_2, null)

        configureVideoView()
//        view_pager_image.adapter  = adapter

// Current date and time
        val dateTime = LocalDateTime.now()
        val time1 = view?.findViewById<TextView>(R.id.time)
        time1?.text = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))

// Curent date
        val date = LocalDate.now()
        println(date)

// Current time
        val time = LocalTime.now()
        println(time)


        return view

    }

    private fun configureVideoView() {
        val viewhome1 = view?.findViewById<VideoView>(R.id.video_home1)
        viewhome1?.setVideoPath(
            "http://www.ebookfrenzy.com/android_book/movie.mp4"
        )
        viewhome1?.start()
    }


}