package com.example.bookhub.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.bookhub.R
import com.example.bookhub.acitvity.MainActivity

class ProfileFragment : Fragment() {

    lateinit var etUserName : EditText
    lateinit var etPassword : EditText
    lateinit var btnSubmit : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view  =  inflater.inflate(R.layout.fragment_profile, container, false)

        etUserName = view.findViewById(R.id.etUserName)
        etPassword = view.findViewById(R.id.etPassword)
        btnSubmit = view.findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val intent = Intent(activity as Context,MainActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }


        return view
    }

}
