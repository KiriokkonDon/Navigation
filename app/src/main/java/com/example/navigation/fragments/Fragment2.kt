package com.example.navigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation.R
import android.content.Intent
import android.net.Uri
import android.widget.TextView
import android.widget.ImageView


class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Настраиваем TextView для перехода по ссылке через Intent
        val LinkTg: ImageView = view.findViewById(R.id.LinkTg)
        LinkTg.setOnClickListener {
            val url = "https://t.me/knop_p_a"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val LinkVk: ImageView = view.findViewById(R.id.LinkVk)
        LinkVk.setOnClickListener {
            val url = "https://vk.com/knop_pa"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }


    }
}
