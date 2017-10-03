package android.com.contactmasterflow

import android.app.Activity
import android.support.design.widget.CollapsingToolbarLayout
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.com.contactmasterflow.dummy.DummyContent
import kotlinx.android.synthetic.main.activity_contact_detail.*
import kotlinx.android.synthetic.main.contact_detail.view.*

/**
 * A fragment representing a single Contact detail screen.
 * This fragment is either contained in a [ContactListActivity]
 * in two-pane mode (on tablets) or a [ContactDetailActivity]
 * on handsets.
 */
/**
 * Mandatory empty constructor for the fragment manager to instantiate the
 * fragment (e.g. upon screen orientation changes).
 */
class ContactDetailFragment : Fragment() {

    private var mItem: DummyContent.DummyItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments.containsKey(ARG_ITEM_ID)) {
            mItem = DummyContent.ITEM_MAP[arguments.getString(ARG_ITEM_ID)]
            val activity = this.activity
            val appBarLayout = activity.toolbar_layout as CollapsingToolbarLayout
            if (appBarLayout != null) {
                appBarLayout.title = mItem!!.content
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.contact_detail, container, false)
        if (mItem != null) {
            (rootView.contact_detail as TextView).text = mItem!!.details
        }

        return rootView
    }

    companion object {
        val ARG_ITEM_ID = "item_id"
    }
}
