package com.cuberto.liquidswipetest

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PageFragment : Fragment() {
    var position : Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        position = arguments?.getInt("POSITION")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutId = if (position == 1) {
            R.layout.first_page
        } else if (position == 2) {
            R.layout.second_page
        } else R.layout.fragment_page_number
        return layoutInflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when (position) {
            1 -> return
            2 -> return
            3 -> view.setBackgroundColor(
             Color.parseColor("#1ea5fc")
            )
            4 -> view.setBackgroundColor(

                   Color.parseColor("#F7EA00")

            )
            5 -> view.setBackgroundColor(

                    Color.parseColor("#FF00C8")

            )
            6 -> view.setBackgroundColor(
                Color.parseColor("#F2E3C9")
            )
            else -> view.setBackgroundColor(
                Color.rgb(
                    (Math.random() * 255).toInt(),
                    (Math.random() * 255).toInt(),
                    (Math.random() * 255).toInt()
                )
            )
        }

    }
}