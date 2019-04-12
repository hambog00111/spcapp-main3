package com.example.mis_pc_11.spc_app1.Links

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.mis_pc_11.spc_app1.R

class FragmentOpenData :
   Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(
            R.layout.fragment_open_data, container,
            false)
        

        val  mWebView = view.findViewById(R.id.web_open_data) as WebView
        mWebView.loadUrl("https://www.gov.ph/data/")

        val webSettings = mWebView.getSettings()
        webSettings.setJavaScriptEnabled(true)

// Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(WebViewClient())



        return  view

    }
}

