package com.example.project.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.project.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val Button1: Button = binding.entry1
        Button1.setOnClickListener {
            val intent = Intent(requireContext(), HomeInfo::class.java)
            intent.putExtra("buttonId", 1)
            startActivity(intent)
            true
        }
        val Button2: Button = binding.entry2
        Button2.setOnClickListener {
            val intent = Intent(requireContext(), HomeInfo::class.java)
            intent.putExtra("buttonId", 2)
            startActivity(intent)
            true
        }
        val Button3: Button = binding.entry3
        Button3.setOnClickListener {
            val intent = Intent(requireContext(), HomeInfo::class.java)
            intent.putExtra("buttonId", 3)
            startActivity(intent)
            true
        }
        val Button4: Button = binding.entry4
        Button4.setOnClickListener {
            val intent = Intent(requireContext(), HomeInfo::class.java)
            intent.putExtra("buttonId", 4)
            startActivity(intent)
            true
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}