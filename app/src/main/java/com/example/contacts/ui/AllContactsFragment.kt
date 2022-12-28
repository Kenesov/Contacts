package com.example.contacts.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.contacts.R
import com.example.contacts.databinding.FragmentContactsBinding

class AllContactsFragment: Fragment(R.layout.fragment_contacts) {
    private lateinit var binding: FragmentContactsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContactsBinding.bind(view)

    }
}