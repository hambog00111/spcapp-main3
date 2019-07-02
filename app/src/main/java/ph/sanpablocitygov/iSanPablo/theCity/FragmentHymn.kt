package ph.sanpablocitygov.iSanPablo.theCity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import ph.sanpablocitygov.iSanPablo.R

class FragmentHymn : Fragment() {
    var str_url: String =
        "https://ia801501.us.archive.org/35/items/SanPabloHymnWithLyrics/San%20Pablo%20Hymn%20with%20Lyrics.mp4"
    lateinit var mediaController: MediaController
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_hymn_layout, container, false)
        val videohome = view.findViewById<View>(R.id.videohome) as VideoView
        videohome.setVideoPath(str_url)
        videohome.start()
        mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videohome)
        videohome.setMediaController(mediaController)




        return  view

    }
}