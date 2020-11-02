package com.example.recyclerview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val AplList: ArrayList<AplModel> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AplList.add(
            AplModel(
                "Twitter",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon1
                )
            )
        )
        AplList.add(
            AplModel(
                "Facebook",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon2
                )
            )
        )
        AplList.add(
            AplModel(
                "Line",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon3
                )
            )
        )

        layoutManager = LinearLayoutManager(this)
        rvAplList.layoutManager = layoutManager
        rvAplList.adapter = RecyclerViewAdapter(this, AplList)
    }
}