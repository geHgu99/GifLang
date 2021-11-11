package com.bignerdrach.android.giflang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

private const val imageAddressB = "https://i.pinimg.com/originals/3f/b8/0f/3fb80febe7407e43ebb02e5940ef3d7d.jpg"
private const val imageAddressL = "https://phonoteka.org/uploads/posts/2021-07/1625676540_2-phonoteka-org-p-pop-art-merlin-krasivo-2.jpg"
private const val imageAddressH = "https://phonoteka.org/uploads/posts/2021-05/1621984870_5-phonoteka_org-p-arti-iz-anime-krasivo-7.jpg"
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(){

    private lateinit var imageView: ImageView
    private lateinit var lastButton: Button
    private lateinit var bestButton: Button
    private lateinit var hotButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.GifImageView)

        lastButton = findViewById(R.id.LastFragmentButton)
        lastButton.setOnClickListener { view: View ->
            Log.d(TAG, "last button")
            Glide
                .with(this)
                .load(imageAddressL)
                .into(imageView)

        }

        bestButton = findViewById(R.id.BestFragmentButton)
        bestButton.setOnClickListener { view: View ->
            Log.d(TAG, "best button")
            Glide
                .with(this)
                .load(imageAddressB)
                .into(imageView)

        }

        hotButton = findViewById(R.id.HotFragmentButton)
        hotButton.setOnClickListener { view: View ->
            Log.d(TAG, "hot button")
            Glide
                .with(this)
                .load(imageAddressH)
                .into(imageView)

        }
    }
}