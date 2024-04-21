package com.example.homework_5_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_5_3m.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener {
            counter++
            binding.tvResult.text = counter.toString()
            if (binding.tvResult.text.toString() == "10") {
                binding.btnMinus.visibility = View.VISIBLE
                binding.btnPlus.visibility = View.GONE
            }
        }
        binding.btnMinus.setOnClickListener {
            counter--
            if (binding.tvResult.text.toString() == "0") {
                val bundle = Bundle()
                val secondFragment = SecondFragment()
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container_fragment, secondFragment).addToBackStack(null).commit()
            }
            binding.tvResult.text = counter.toString()
        }
    }

}
