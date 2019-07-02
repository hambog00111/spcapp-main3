package ph.sanpablocitygov.iSanPablo.tourism.gallery

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import ph.sanpablocitygov.iSanPablo.R

class FragmentGallery : Fragment() {
    var str_url: String =
        "https://ia601509.us.archive.org/3/items/LeonilaPark/LeonilaPark.mp4"
    lateinit var mediaController: MediaController
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


        val videohome = view.findViewById<View>(R.id.video_gallery) as VideoView
        videohome.setVideoPath(str_url)

        mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videohome)
        videohome.setMediaController(mediaController)

        val btnplay = view?.findViewById<Button>(R.id.btn_play)
        btnplay?.setOnClickListener {
            videohome.start()
        }
        return view
        }
    }

