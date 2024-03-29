package ph.sanpablocitygov.iSanPablo.tourism.gallery.videos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ph.sanpablocitygov.iSanPablo.R
import kotlinx.android.synthetic.main.activity_video_view.*

class ActivityVideoView: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_video_view)

        val videoLink = intent.getStringExtra(ActivityVideoDetail.HolderDetailVideo.VIDEO_WEB_LINK)

        webView_video_view.settings.javaScriptEnabled = true
        webView_video_view.settings.loadWithOverviewMode = true
        webView_video_view.settings.useWideViewPort = true


        webView_video_view.loadUrl(videoLink)
    }
}