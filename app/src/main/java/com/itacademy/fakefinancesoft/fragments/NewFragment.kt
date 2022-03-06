package com.itacademy.fakefinancesoft.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.pedant.SweetAlert.SweetAlertDialog
import com.itacademy.fakefinancesoft.databinding.FragmentNewBinding

class NewFragment : Fragment() {
    private var _binding: FragmentNewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            val dialog = SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE)
            dialog.progressHelper.barColor = Color.parseColor("#A5DC86")
            dialog.titleText = "Well Done!"
            dialog.setCancelable(false)
            dialog.show()
        }
        return binding.root
    }
}