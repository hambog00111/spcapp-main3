package com.example.mis_pc_11.spc_app1.Tourism.Gallery

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mis_pc_11.spc_app1.R
import com.example.mis_pc_11.spc_app1.Tourism.Gallery.Pictures.ActivityPictures
import com.example.mis_pc_11.spc_app1.Tourism.Gallery.Videos.ActivityVideos

class FragmentGallery : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_gallery_layout, null)
//
//        val btn_pictures = view?.findViewById<Button>(R.id.button_picture)
//        btn_pictures?.setOnClickListener{
//            val intent = Intent (activity, ActivityPictures::class.java)
//            activity?.startActivity(intent)
//        }
//        val btn_videos = view?.findViewById<Button>(R.id.button_videos)
//        btn_videos?.setOnClickListener{
//            val intent = Intent (activity, ActivityVideos::class.java)
//            activity?.startActivity(intent)
//        }
return view
        }
    }

