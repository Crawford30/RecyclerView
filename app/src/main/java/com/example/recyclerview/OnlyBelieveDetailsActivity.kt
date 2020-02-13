package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.recyclerview.databinding.ActivityOnlyBelieveDetailsBinding
import kotlinx.android.synthetic.main.activity_only_believe_details.*

class OnlyBelieveDetailsActivity : AppCompatActivity() {

    lateinit var binding : ActivityOnlyBelieveDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_only_believe_details)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_only_believe_details)

        onlybelieve_title.text = getIntent().getStringExtra("TITLE")
        onlybelieve_lyrics.text = getIntent().getStringExtra("LYRIC")
        image_logo.setImageResource(getIntent().getStringExtra("LOGO").toInt())

    }
}
