package com.example.mis_pc_11.spc_app1.Disclosure

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.mis_pc_11.spc_app1.R

class Disclosure1 : Fragment() {


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(
            R.layout.fragment_disclosure1, container,
            false)


        val  mWebView = view.findViewById(R.id.web_disclosure_1) as WebView
        mWebView.loadUrl("http://www.sanpablocitygov.ph/docs/4th-qtr-SPP.xls")

        val webSettings = mWebView.settings
        webSettings.javaScriptEnabled = true

// Force links and redirects to open in the WebView instead of in a browser
        mWebView.webViewClient = WebViewClient()



        return  view

    }
}