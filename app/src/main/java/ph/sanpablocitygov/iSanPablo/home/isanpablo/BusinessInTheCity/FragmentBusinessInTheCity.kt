package ph.sanpablocitygov.iSanPablo.home.isanpablo.BusinessInTheCity

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.DownloadManager
import android.content.DialogInterface
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat.getSystemService
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import kotlinx.android.synthetic.main.dialog_bplo.view.*
import kotlinx.android.synthetic.main.dialog_business_mayor_permit.view.*
import ph.sanpablocitygov.iSanPablo.home.isanpablo.BusinessInTheCity.BPLO.FragmentBPLOonline
import ph.sanpablocitygov.iSanPablo.R
import ph.sanpablocitygov.iSanPablo.home.isanpablo.BusinessInTheCity.PrintMayorsPermit.FragmentMayorsPermit
import ph.sanpablocitygov.iSanPablo.links.FragmentHomeCSC

@Suppress("PLUGIN_WARNING")
class FragmentBusinessInTheCity : Fragment() {

    @SuppressLint("SetTextI18n", "InflateParams")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_isanpablo_businesscity, container, false)

        val btnbplo = view.findViewById<Button>(R.id.btn_business_bplo)
        btnbplo.setOnClickListener {

            val bploView = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_bplo, null)

            val bplobBuilder = AlertDialog.Builder(requireContext())
                .setView(bploView)
   
            val bploDialog = bplobBuilder.show()

            bploView.btn_download_bplo.setOnClickListener {
                bploDialog.dismiss()
                var str = "Would you like to download this document?"
                val builder = AlertDialog.Builder(requireContext())
                with(builder) {
                    setMessage(str)
                    setTitle("Download BPLO Form")

                    setPositiveButton("OK", DialogInterface.OnClickListener
                    { _, _ ->  val downloadManager: DownloadManager = getSystemService(requireContext(),
                        DownloadManager::class.java) as DownloadManager
                        val uri = Uri.parse("http://www.sanpablocitygov.ph/docs/BUSINESS%20PERMIT%20APPLICATION%20FORM.docx")
                        val request = DownloadManager.Request(uri)
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                        downloadManager.enqueue(request)  })
                    setNegativeButton("CANCEL", null)
                }
                val alertDialog = builder.create()
                alertDialog.show()
            }
            bploView.btn_online_bplo.setOnClickListener {
                bploDialog.dismiss()
                activity!!.supportFragmentManager.beginTransaction().replace(
                    R.id.frag_container,
                    FragmentBPLOonline()
                    , null)
                    .addToBackStack(null)
                    .commit()
            }

        }
//        val btnbta = view.findViewById<Button>(R.id.btn_business_bta)
//        btnbta.setOnClickListener {
//            activity!!.supportFragmentManager.beginTransaction().replace(
//                R.id.frag_container,
//                FragmentA()
//            ).commit()
//        }


//
//            val btaBuilder = AlertDialog.Builder(requireContext()).setView(btaView)
//            val btaDialog = btaBuilder.show()
//
////            val bundle = Bundle()
////            bundle.putString("fullname", btafname)
//            val btafname = btaView.txt_assess_first.text.toString()
//                val btamname = btaView.txt_assess_middle.text.toString()
//                val btalname = btaView.txt_assess_last.text.toString()
//                val btarefnum = btaView.txt_assess_ref.text.toString()
//                val btaemail = btaView.txt_assess_email.text.toString()
//            txt_assess_fullname.text = (btalname + "," + btafname + btamname)
//            txt_assess_refcon.text = btarefnum
//            txt_assess_emailcon.text = btaemail
//            btaView.btn_assess_send.setOnClickListener {
//
//
//                val btaConfirmView  = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_business_tax_ass_confirmation, null)
//                val btaConfirmBuilder = AlertDialog.Builder(requireContext()).setView(btaConfirmView)
//                val btaConfirmDialog = btaConfirmBuilder.show()
//
////                val btafname = btaView.txt_assess_first.text.toString()
////                val btamname = btaView.txt_assess_middle.text.toString()
////                val btalname = btaView.txt_assess_last.text.toString()
////                val btarefnum = btaView.txt_assess_ref.text.toString()
////                val btaemail = btaView.txt_assess_email.text.toString()
////                val btafname = btaConfirmView.txt_assess_last.text.toString()
//
//                txt_assess_fullname.text = btafname
////                txt_assess_fullname.text = "$btalname, $btafname $btamname"
////                txt_assess_emailcon.text = btarefnum
////                txt_assess_emailcon.text = btaemail
//
//                btaConfirmView.btn_assess_edit.setOnClickListener{
//                    btaConfirmDialog.dismiss()
//                }
//
//                btaConfirmView.btn_assess_cancel.setOnClickListener{
//                    btaConfirmDialog.dismiss()
//                    btaDialog.dismiss()
//                }
//
//            }
//
//            btaView.btn_assess_cancel.setOnClickListener {
//                btaDialog.dismiss()
//            }
//            btaView.btn_assess_clearall.setOnClickListener {
////                txt_assess_first.setText("")
////                txt_assess_middle.setText("")
//                txt_assess_last.setText("")
////                txt_assess_email.setText("")
////                txt_assess_ref.setText("")
//
//            }
//
//            return  view
//        }



        val btnmp = view.findViewById<Button>(R.id.btn_business_printmayor)
        btnmp.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(
                R.id.frag_container,
                FragmentMayorsPermit() , null)
                .addToBackStack(null)
                .commit()
        }

        return  view

    }
}