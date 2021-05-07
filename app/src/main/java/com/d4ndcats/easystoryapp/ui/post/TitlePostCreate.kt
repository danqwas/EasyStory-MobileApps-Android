package com.d4ndcats.easystoryapp.ui.post

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.d4ndcats.easystoryapp.R
import com.google.android.material.textfield.TextInputEditText

class TitlePostCreate:Fragment() {
    var title: String= ""
    var description: String= ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.post_title_description, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextInputEditText>(R.id.input_title).setText(title)
        view.findViewById<TextInputEditText>(R.id.input_description).setText(description)
        view.findViewById<Button>(R.id.button_edit_post).setOnClickListener(){
            val action = TitlePostCreateDirections.actionPostTitleDescriptionToNavWritePost()

            title=  view.findViewById<TextInputEditText>(R.id.input_title).text.toString()
            description=  view.findViewById<TextInputEditText>(R.id.input_description).text.toString()
            view.findViewById<TextInputEditText>(R.id.input_title).setText(title)
            view.findViewById<TextInputEditText>(R.id.input_description).setText(description)
            findNavController().navigate(action)


        }
        view.findViewById<Button>(R.id.button_public_post).setOnClickListener(){
            val builder = AlertDialog.Builder(context)
            val action2= TitlePostCreateDirections.actionPostTitleDescriptionToNavHome()
            val builder2 = AlertDialog.Builder(context)
            builder2.setTitle("PUBLICACIÓN EXITOSA")
            builder2.setNeutralButton("Ok") { dialogInterface: DialogInterface, i: Int ->
                title = ""
                description= ""

                (findNavController().navigate(action2))
            }
            builder.setTitle("¿Seguro que deseas publicar?")
            builder.setPositiveButton("PUBLICAR") { dialogInterface: DialogInterface, i: Int ->
                (
                   builder2.show()

                )
            }
            builder.setNegativeButton("REGRESAR") { dialogInterface: DialogInterface, i: Int ->
                (Toast.makeText(context,android.R.string.no,Toast.LENGTH_SHORT).show())}
            builder.show()
        }

    }
}