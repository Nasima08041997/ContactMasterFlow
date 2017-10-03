package android.com.contactmasterflow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.com.contactmasterflow.ContactListFragment


/**
 * Created by nasima on 03/10/17.
 */
class ContactActivity : AppCompatActivity() , ContactNavigationListener {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        loadContactListFragment()
    }

    lateinit var loadContactListFragment: ContactListFragment

    override fun loadContactListFragment() {

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        loadContactListFragment = ContactListFragment()
        fragmentTransaction.replace(R.id.container, loadContactListFragment).commit()
    }

    lateinit var loadContactDetailFragment : ContactDetailFragment
    override  fun loadContactDetailFragment()
    {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        loadContactDetailFragment = ContactDetailFragment()
        fragmentTransaction.replace(R.id.container, loadContactDetailFragment).commit()

    }
}