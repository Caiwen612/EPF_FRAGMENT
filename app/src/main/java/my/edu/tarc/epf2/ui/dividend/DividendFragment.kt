package my.edu.tarc.epf2.ui.dividend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.edu.tarc.epf2.R
import my.edu.tarc.epf2.databinding.FragmentDividendBinding
import my.edu.tarc.epf2.databinding.FragmentInvestmentBinding


/**
 * A simple [Fragment] subclass.
 * Use the [DividendFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DividendFragment : Fragment() {
    private var _binding: FragmentDividendBinding? = null //cw: variable name autogenerated by system based on name of class
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!! //use getter to get the things


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        //Fragment cannot occur by its on
        //inflater: used to inflate the layout file by fragment
        //container: Where u want me to display, refer to navigation host
        // savedInstanceState:
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDividendBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}