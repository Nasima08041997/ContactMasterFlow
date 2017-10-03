package android.com.contactmasterflow

import android.app.PendingIntent.getActivity
import android.com.contactmasterflow.dummy.DummyContent
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import kotlinx.android.synthetic.main.contact_list.*
import kotlinx.android.synthetic.main.contact_list_content.*
import kotlinx.android.synthetic.main.contact_list_content.view.*


/**
 * Created by nasima on 03/10/17.
 */
class ContactListFragment : Fragment(){

    private var mTwoPane: Boolean = false
    private var mRecyclerView: RecyclerView? = null
    private var mAdapter:ContactNavigationListener =null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.contact_list, container, false)
        mRecyclerView = view?.findViewById<View>(R.id.contact_list) as RecyclerView
        mRecyclerView?.setLayoutManager(LinearLayoutManager(getActivity()))
        //contact_list.layoutManager = LinearLayoutManager(context)
        return view
    }

    private fun updateUI()
    {
        mAdapter = DetailsHolder()
    }

    public class DetailsHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val mIdView: TextView = itemView.idview
        val mContentView: TextView = itemView.content

        fun MessageHolder() {

        }

        fun bind() {

        }
    }
}




