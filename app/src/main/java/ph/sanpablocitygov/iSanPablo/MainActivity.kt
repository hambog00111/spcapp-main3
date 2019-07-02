package ph.sanpablocitygov.iSanPablo

import android.app.Activity
import android.app.AlertDialog
import android.app.DownloadManager
import android.content.Context
import android.content.DialogInterface
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.MenuItem
import ph.sanpablocitygov.iSanPablo.goverment.department.FragmentDepartment
import ph.sanpablocitygov.iSanPablo.goverment.FragmentLocalOfficials
import ph.sanpablocitygov.iSanPablo.goverment.FragmentOfficeMap
import ph.sanpablocitygov.iSanPablo.home.FragmentHome
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.dialog_bplo.view.*
import kotlinx.android.synthetic.main.dialog_economy.view.*
import ph.sanpablocitygov.iSanPablo.links.*
import ph.sanpablocitygov.iSanPablo.theCity.FragmentHistory
import ph.sanpablocitygov.iSanPablo.theCity.FragmentHymn
import ph.sanpablocitygov.iSanPablo.theCity.FragmentLocationTopology
import ph.sanpablocitygov.iSanPablo.theCity.MissionVision
import ph.sanpablocitygov.iSanPablo.theCity.barangay.FragmentBarangay
import ph.sanpablocitygov.iSanPablo.theCity.sanPablenos.FragmentSanPablo
import ph.sanpablocitygov.iSanPablo.tourism.FragmentLandmarks
//import ph.sanpablocitygov.iSanPablo.tourism.FragmentTourism
import ph.sanpablocitygov.iSanPablo.tourism.gallery.FragmentGallery

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


//    internal var expandableListView: ExpandableListView? = null
//    internal var adapter: ExpandableListAdapter? = null
//    internal var titleList: List<String> ? = null
//    val data: HashMap<String, List<String>>
//
//        get() {
//            val listData = HashMap<String, List<String>>()
//            val theTourism = ArrayList<String>()
//            theTourism.add("Tourism Master Plan")
//            theTourism.add("Gallery")
//            theTourism.add("Landmarks")
//            theTourism.add("Events")
//            val theHome = ArrayList<String>()
//
//            val theCity = ArrayList<String>()
//            theCity.add("History")
//            theCity.add("San Pableños")
//            theCity.add("Barangay")
//            theCity.add("Hymn")
//            theCity.add("Location")
//            theCity.add("Mission and Vision")
//
//            val theGoverment = ArrayList<String>()
//            theGoverment.add("Office Vicinity Map")
//            theGoverment.add("Local Officials")
//            theGoverment.add("Departments")
//
//            val theEconomy = ArrayList<String>()
//            theEconomy.add("Comprehensive Land Usage Program Vol. 1")
//            theEconomy.add("Comprehensive Land Usage Program Vol. 2")
//            theEconomy.add("Comprehensive Land Usage Program Vol. 3")
//            theEconomy.add("Comprehensive Development Plan")
//            theEconomy.add("SPC Ecological Profile")
//            theEconomy.add("CDP Annexes")
//
//
//
//            val theOthers = ArrayList<String>()
//            theOthers.add("Citizen's Charter")
//            theOthers.add("Browser")
//
//            val theFillup = ArrayList<String>()
//            theFillup.add("BPLO Fill Up")
//
//            val theAbout = ArrayList<String>()
//            theAbout.add("GOV.PH")
//            theAbout.add("Open Data Portal")
//            theAbout.add("Official Gazette")
//
//            val theLinks = ArrayList<String>()
//            theLinks.add("Office of the President")
//            theLinks.add("Office of the Vice President")
//            theLinks.add("Senate of the Philippines")
//            theLinks.add("House of Representatives")
//            theLinks.add("Supreme Court")
//            theLinks.add("Court of the Appeals")
//            theLinks.add("Sandiganbayan")
//
//
//
//            listData["Goverment"] = theCity
//            listData["Economy"] = theEconomy
//            listData["Home"] = theHome
//            listData["The City"] = theCity
//            listData["Tourism"] = theTourism
//
//            listData["Others"] = theOthers
//            listData["Fill Up Forms"] = theFillup
//            listData["About GOVPH"] = theAbout
//            listData["Government Links"] = theLinks
//
//            return listData
//        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

//        fab.setOnClickListener { view ->
//            var show: Any = Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        val navView: NavigationView = findViewById(R.id.nav_view)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
       supportFragmentManager.beginTransaction().replace(
           R.id.frag_container,
           FragmentHome()
       ).commit()


//
//        var mdrawerlayout = findViewById<DrawerLayout>(R.id.drawer_layout)
//        var expandableListview = findViewById<ExpandableListView>(R.id.expendableListView)


//        expandableListView = findViewById(R.id.expendableListView)
//        if (expandableListView != null) {
//            val listData = data
//            titleList = ArrayList(listData.keys)
//            adapter = CustomExpandableListAdapter(this, titleList as ArrayList<String>, listData)
//            expandableListView!!.setAdapter(adapter)
//
//            expandableListView!!.setOnGroupExpandListener { groupPosition -> Toast.makeText(applicationContext, (titleList as ArrayList<String>)[groupPosition] + " List Expanded.", Toast.LENGTH_SHORT).show() }
//
//            expandableListView!!.setOnGroupCollapseListener { groupPosition -> Toast.makeText(applicationContext, (titleList as ArrayList<String>)[groupPosition] + " List Collapsed.", Toast.LENGTH_SHORT).show() }
//
//            expandableListView!!.setOnChildClickListener { _, _, groupPosition, childPosition, _ ->
//                Toast.makeText(applicationContext, "Clicked: " + (titleList as ArrayList<String>)[groupPosition] + " -> " + listData[(titleList as ArrayList<String>)[groupPosition]]!!.get(childPosition), Toast.LENGTH_SHORT).show()
//                false
//            }
//        }

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


//
//
//    val police = "09081930819"
//    val emergency = "09089078124"
//    val fire = "09995784943"
//    val PHONE_REQ = 1
//
    // actions on click menu items
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {

//
//        R.id.police_menu -> {
//
//            if (ActivityCompat.checkSelfPermission(
//                    this,
//                    Manifest.permission.CALL_PHONE
//                ) != PackageManager.PERMISSION_GRANTED
//            ) {
//
//                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), PHONE_REQ)
//
//            } else {
//
//                policecall()
//            }
//
//            true
//        }

//        R.id.emergency_menu -> {
//
//            if (ActivityCompat.checkSelfPermission(
//                    this,
//                    Manifest.permission.CALL_PHONE
//                ) != PackageManager.PERMISSION_GRANTED
//            ) {
//
//                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), PHONE_REQ)
//            } else {
//                emergencycall()
//            }
//            true
//        }

//        R.id.fire_menu -> {
//
//            if (ActivityCompat.checkSelfPermission(
//                    this,
//                    Manifest.permission.CALL_PHONE
//                ) != PackageManager.PERMISSION_GRANTED
//            ) {
//
//                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), PHONE_REQ)
//            } else {
//
//                firecall()
//            }
//            true
//        }
//
//        R.id.admin -> {
//
//        spc_map()
//
//            true
//        }


        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }

    }

//    private fun policecall() {
//        val callIntent = Intent(Intent.ACTION_CALL)
//        callIntent.data = Uri.parse("tel:" + police)
//
//        startActivity(callIntent)
//    }
//
////    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
////        if(requestCode == PHONE_REQ)policecall()
////
////    }
//
//
//    private fun emergencycall(){
//        val callIntent =Intent(Intent.ACTION_CALL)
//        callIntent.data = Uri.parse("tel:" + emergency)
//
//        startActivity(callIntent)
//    }
//
//    private fun firecall(){
//        val callIntent = Intent(Intent.ACTION_CALL)
//        callIntent.data = Uri.parse("tel:" + fire)
//
//        startActivity(callIntent)
//    }
//
//    private fun spc_map(){
//        supportFragmentManager.beginTransaction().replace(
//            R.id.frag_container,
//            FragmentGoogleMap()
//        ).commit()
//
//    }
//
//


//    @SuppressLint("CommitTransaction")
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentHome()
                ).commit()
            }

            R.id.nav_history -> {
                supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentHistory()).commit()
            }
            R.id.nav_barangay -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentBarangay()
                ).commit()
            }
            R.id.nav_location -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentLocationTopology()
                ).commit()
            }
            R.id.nav_hymn -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentHymn()
                ).commit()
            }
            R.id.nav_sanpablo -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentSanPablo()
                ).commit()
            }
            R.id.nav_department_head -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentDepartment()
                ).commit()
            }
            R.id.nav_mission -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    MissionVision()
                ).commit()
            }

            R.id.nav_local_officials -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentLocalOfficials()
                ).commit()
            }

            R.id.nav_economy ->{
                val ecoView = LayoutInflater.from(this).inflate(R.layout.dialog_economy, null)

                val ecoBuilder = AlertDialog.Builder(this)
                    .setView(ecoView)
                    .setTitle("Economy")

                val ecoDialog = ecoBuilder.show()

                ecoView.btn_eco_vol1.setOnClickListener {
                    ecoDialog.dismiss()
                    var str = "Would you like to download this document?"
                    val builder = AlertDialog.Builder(this)
                    with(builder) {
                        setMessage(str)
                        setTitle("VOLUME 1")
                        setPositiveButton("OK", DialogInterface.OnClickListener
                        { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                            this@MainActivity,
                            DownloadManager::class.java
                        ) as DownloadManager
                            val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/VOLUME%201%20The%20Comprehensive%20Land%20Use%20Plan%20San%20Pablo%20City%20as%20of%20Nov%2030%202016.pdf")
                            val request = DownloadManager.Request(uri)
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            downloadManager.enqueue(request)  })
                        setNegativeButton("CANCEL", null)
                    }
                    val alertDialog = builder.create()
                    alertDialog.show()
                }
                ecoView.btn_eco_vol2.setOnClickListener {
                    ecoDialog.dismiss()
                    var str = "Would you like to download this document?"
                    val builder = AlertDialog.Builder(this)
                    with(builder) {
                        setMessage(str)
                        setTitle("VOLUME 2")

                        setPositiveButton("OK", DialogInterface.OnClickListener
                        { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                            this@MainActivity,
                            DownloadManager::class.java
                        ) as DownloadManager
                            val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/VOLUME%202%20Zoning%20Ordinance%20San%20Pablo%20City%20as%20of%20Nov%2030%202016.pdf")
                            val request = DownloadManager.Request(uri)
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            downloadManager.enqueue(request)  })
                        setNegativeButton("CANCEL", null)
                    }
                    val alertDialog = builder.create()
                    alertDialog.show()
                }

                ecoView.btn_eco_vol3.setOnClickListener {
                    ecoDialog.dismiss()
                    var str = "Would you like to download this document?"
                    val builder = AlertDialog.Builder(this)
                    with(builder) {
                        setMessage(str)
                        setTitle("VOLUME 3")

                        setPositiveButton("OK", DialogInterface.OnClickListener
                        { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                            this@MainActivity,
                            DownloadManager::class.java
                        ) as DownloadManager
                            val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/VOLUME%203%20Sectoral%20Studies%20San%20Pablo%20City%20UPDATED_as%20of%20Nov%2027%202016.pdf")
                            val request = DownloadManager.Request(uri)
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            downloadManager.enqueue(request)  })
                        setNegativeButton("CANCEL", null)
                    }
                    val alertDialog = builder.create()
                    alertDialog.show()
                }

                ecoView.btn_eco_plan.setOnClickListener {
                    ecoDialog.dismiss()
                    var str = "Would you like to download this document?"
                    val builder = AlertDialog.Builder(this)
                    with(builder) {
                        setMessage(str)
                        setTitle("COMPREHENSIVE DEVELOPMENT PLAN")

                        setPositiveButton("OK", DialogInterface.OnClickListener
                        { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                            this@MainActivity,
                            DownloadManager::class.java
                        ) as DownloadManager
                            val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/CDP%20Annexes%202018-2023.pdf")
                            val request = DownloadManager.Request(uri)
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            downloadManager.enqueue(request)  })
                        setNegativeButton("CANCEL", null)
                    }
                    val alertDialog = builder.create()
                    alertDialog.show()
                }

                ecoView.btn_eco_prof.setOnClickListener {
                    ecoDialog.dismiss()
                    var str = "Would you like to download this document?"
                    val builder = AlertDialog.Builder(this)
                    with(builder) {
                        setMessage(str)
                        setTitle("SPC ECOLOGICAL PROFILE")

                        setPositiveButton("OK", DialogInterface.OnClickListener
                        { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                            this@MainActivity,
                            DownloadManager::class.java
                        ) as DownloadManager
                            val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/SPC%20Ecological%20Profile.pdf")
                            val request = DownloadManager.Request(uri)
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            downloadManager.enqueue(request)  })
                        setNegativeButton("CANCEL", null)
                    }
                    val alertDialog = builder.create()
                    alertDialog.show()
                }

                ecoView.btn_eco_cdp.setOnClickListener {
                    ecoDialog.dismiss()
                    var str = "Would you like to download this document?"
                    val builder = AlertDialog.Builder(this)
                    with(builder) {
                        setMessage(str)
                        setTitle("CDP ANNEXES")

                        setPositiveButton("OK", DialogInterface.OnClickListener
                        { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                            this@MainActivity,
                            DownloadManager::class.java
                        ) as DownloadManager
                            val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/CDP%20Annexes%202018-2023.pdf")
                            val request = DownloadManager.Request(uri)
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            downloadManager.enqueue(request)  })
                        setNegativeButton("CANCEL", null)
                    }
                    val alertDialog = builder.create()
                    alertDialog.show()
                }
            }

            R.id.nav_gallery ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentGallery()
                ).commit()
            }

            R.id.nav_tourism_plan->{
                    var str = "Would you like to download this document?"
                    val builder = AlertDialog.Builder(this)
                    with(builder) {
                        setMessage(str)
                        setTitle("Tourism Master Plan")

                        setPositiveButton("OK", DialogInterface.OnClickListener
                        { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                            applicationContext,
                            DownloadManager::class.java
                        ) as DownloadManager
                            val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/SP%20TMP.pdf")
                            val request = DownloadManager.Request(uri)
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            downloadManager.enqueue(request)  })
                        setNegativeButton("CANCEL", null)
                    }
                    val alertDialog = builder.create()

                    alertDialog.show()

        }

            R.id.nav_charter->{
                var str = "Would you like to download this document?"
                val builder = AlertDialog.Builder(this)
                with(builder) {
                    setMessage(str)
                    setTitle("Citizen's Charter")

                    setPositiveButton("OK", DialogInterface.OnClickListener
                    { _, _ ->  val downloadManager: DownloadManager = ContextCompat.getSystemService(
                        applicationContext,
                        DownloadManager::class.java
                    ) as DownloadManager
                        val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/SPC%20CC%20V%2004.24.19.pdf")
                        val request = DownloadManager.Request(uri)
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                        downloadManager.enqueue(request)  })
                    setNegativeButton("CANCEL", null)
                }
                val alertDialog = builder.create()

                alertDialog.show()

            }
            R.id.nav_landmarks ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentLandmarks()
                ).commit()
            }
            R.id.nav_official_map ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentOfficeMap()
                ).commit()
            }


            R.id.nav_webview ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentBrowser()
                ).commit()
            }

            R.id.nav_bplo ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentFillUp()
                ).commit()
            }

            R.id.nav_govph ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentGOV()
                ).commit()
            }
            R.id.nav_open_data ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentOpenData()
                ).commit()
            }
            R.id.nav_official_gazette ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentOfficialGazette()
                ).commit()
            }

            R.id.nav_president ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentOfficePresident()
                ).commit()
            }
            R.id.nav_vice_president ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentOfficeVice()
                ).commit()
            }
            R.id.nav_senate ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentSenate()
                ).commit()
            }
            R.id.nav_representatives ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentRepresentatives()
                ).commit()
            }
            R.id.nav_supreme_court ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentSupremeCourt()
                ).commit()
            }
            R.id.nav_court ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentCourtAppeals()
                ).commit()
            }
            R.id.nav_sandiganbayan ->{
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentSandiganbayan()
                ).commit()
            }

            else -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentHome()
                ).commit()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }


}

