package com.d4ndcats.easystoryapp.ui.post

import android.content.Intent
import android.net.sip.SipSession
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.d4ndcats.easystoryapp.R
import com.google.android.material.textfield.TextInputEditText

class CreatePostFragment : Fragment() {
    var text: String= "aaaaaaa"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.create_post, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextInputEditText>(R.id.input_post_story).setText(text)
        view.findViewById<Button>(R.id.next_button).setOnClickListener(){
            val action = CreatePostFragmentDirections.actionNavWritePostToPostTitleDescription()
            text=  view.findViewById<TextInputEditText>(R.id.input_post_story).text.toString()
            view.findViewById<TextInputEditText>(R.id.input_post_story).setText(text)
            findNavController().navigate(action)
        }
    }
}