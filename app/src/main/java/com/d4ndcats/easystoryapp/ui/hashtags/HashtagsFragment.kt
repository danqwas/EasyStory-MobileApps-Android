package com.d4ndcats.easystoryapp.ui.hashtags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.d4ndcats.easystoryapp.R

class HashtagsFragment : Fragment() {

    private lateinit var hashtagsViewModel: HashtagsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        hashtagsViewModel =
                ViewModelProvider(this).get(HashtagsViewModel::class.java)
        val root = inflater.inflate(R.layout.hashtags, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        hashtagsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}