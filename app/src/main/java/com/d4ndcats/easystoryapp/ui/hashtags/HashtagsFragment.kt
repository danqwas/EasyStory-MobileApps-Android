package com.d4ndcats.easystoryapp.ui.hashtags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.d4ndcats.easystoryapp.R
import com.d4ndcats.easystoryapp.ui.post.CreatePostFragmentDirections
import com.google.android.material.textfield.TextInputEditText

class HashtagsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.hashtags, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val action = HashtagsFragmentDirections.actionNavHashtagsToHashtagPostview()
        view.findViewById<Button>(R.id.button_hashtagid).setOnClickListener(){
            findNavController().navigate(action)
        }
        view.findViewById<Button>(R.id.button_hashtagid2).setOnClickListener(){
            findNavController().navigate(action)
        }
        view.findViewById<Button>(R.id.bt_hashtag_id3).setOnClickListener(){
            findNavController().navigate(action)
        }
    }
}