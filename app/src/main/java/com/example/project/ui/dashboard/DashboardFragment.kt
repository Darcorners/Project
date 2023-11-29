package com.example.project.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.BitmapFactory
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.project.databinding.FragmentDashboardBinding
import com.example.project.R

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val Avatar: ImageView = binding.Avatar
        val avatarImagePath = R.drawable.no_ava
        val avatarBitmap = BitmapFactory.decodeResource(resources, avatarImagePath)
        Avatar.setImageBitmap(avatarBitmap)

        val INTname: TextView = binding.INTname
        val INTsurname: TextView = binding.INTsurName
        val INTpost: TextView = binding.INTpost

        val Name = "Мария"
        val SurName = "Кузякова"
        val Post = "Уборщик"

        INTname.setText(Name)
        INTsurname.setText(SurName)
        INTpost.setText(Post)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}