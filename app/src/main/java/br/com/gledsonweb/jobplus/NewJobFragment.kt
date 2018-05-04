package br.com.gledsonweb.jobplus


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class NewJobFragment : Fragment() {

    companion object{
        fun newInstance() : Fragment
        {
            var fb : NewJobFragment = NewJobFragment()
            return fb
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_job, container, false)
    }


}
