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
            .load(R.drawable.zara_larsson)
            .circleCrop()
            .into(ivStory2)

        Glide.with(this)
            .load(R.drawable.martin_garrix)
            .circleCrop()
            .into(ivStory3)

        Glide.with(this)
            .load(R.drawable.justin_beiber)
            .circleCrop()
            .into(ivStory4)

        Glide.with(this)
            .load(R.drawable.chelsea)
            .circleCrop()
            .into(ivStory5)

        Glide.with(this)
            .load(R.drawable.agent_of_shield)
            .circleCrop()
            .into(ivStory6)

        Glide.with(this)
            .load(R.drawable.zedd)
            .circleCrop()
            .into(ivStory7)

        // feed
        Glide.with(this)
            .load(R.drawable.martin_garrix)
            .circleCrop()
            .into(ivFeed1)

        // comment icon
        Glide.with(this)
            .load(R.drawable.oppa)
            .circleCrop()
            .into(ivCommentIcon1)



    }
}