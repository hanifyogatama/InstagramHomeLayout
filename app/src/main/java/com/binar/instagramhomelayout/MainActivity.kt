package com.binar.instagramhomelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()

        Glide.with(this)
            .load(R.drawable.oppa)
            .circleCrop()
            .into(ivStory1)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivStory2)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivStory3)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivStory4)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivStory5)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivStory6)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivStory7)

        // feed
        Glide.with(this)
            .load(R.drawable.oppa)
            .circleCrop()
            .into(ivFeed1)


    }
}