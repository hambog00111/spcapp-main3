package com.example.mis_pc_11.spc_app1.Goverment.Department

import android.os.AsyncTask
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import com.example.mis_pc_11.spc_app1.R
import org.json.JSONArray
import org.json.JSONObject
import java.lang.ref.WeakReference
import java.net.HttpURLConnection
import java.net.URL
import android.widget.Button as Button

class FragmentDepartment : Fragment() {

    private lateinit var listView: ListView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_departments, container, false)
        listView = view.findViewById(R.id.listview_department)
        GetDeptLs(this).execute()
        return  view

    }

    inner class GetDeptLs internal constructor(mContext: FragmentDepartment): AsyncTask<Void,Void,String>(){
        private var res: String? = null
        private val fragRef: WeakReference<FragmentDepartment> = WeakReference(mContext)
        var mView: ListView = fragRef.get()!!.listView

        override fun onPreExecute() {

        }

        override fun doInBackground(vararg params: Void?): String {
            var xhr: String = ""
            val conn = URL("http://www.sanpablocitygov.ph/api/get-dept-list").openConnection() as HttpURLConnection
            try {
                conn.connect()
                if(conn.responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
                    xhr =
                        "{\"depts\": [{\"dept_office\": \"null\", \"dept_position\": \"null\", \"dept_name\":\"null\"}]}"
                } else {
                    xhr = conn.inputStream.bufferedReader().readText()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                conn.disconnect()
            }
            return xhr
        }

        override fun onPostExecute(result: String?) {
            res = result
            ListDept(res!!)
        }

        fun ListDept(jsonStr: CharSequence) {
            val list = mutableListOf<DepartmentModel>()
            try {
                val dLs: JSONArray = JSONObject(jsonStr.toString()).getJSONArray("depts")
                for(i in 0 until dLs.length() step 1) {
                    val post: JSONObject = dLs.getJSONObject(i)
                    list.add(DepartmentModel(post.getString("dept_office"), post.getString("dept_position"), post.getString("dept_name")))

                }
                val adapter = DepartmentAdapter(
                    fragRef.get()!!.requireContext(),
                    R.layout.row_department,
                    list
                )
                mView.adapter = adapter
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    }
}