package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.laboratory1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val wick_image: ImageView = findViewById(R.id.imageView1)
        wick_image.setImageResource(R.drawable.wick)
        val venom_image: ImageView = findViewById(R.id.imageView2)
        venom_image.setImageResource(R.drawable.venom)
        val avatar_image: ImageView = findViewById(R.id.imageView3)
        avatar_image.setImageResource(R.drawable.avatar)

        binding.catBtn.setOnClickListener {
            val intent = Intent(this, DescriptionActivity::class.java)

            intent.putExtra("Film", binding.wickView.text.toString())
            intent.putExtra("Description", binding.catDescription.text.toString())
            intent.putExtra("ImageID",1)

            startActivity(intent)
        }
        binding.dogBtn.setOnClickListener {
            val intent = Intent(this, DescriptionActivity::class.java)

            intent.putExtra("Film", binding.VenomView.text.toString())
            intent.putExtra("Description", binding.dogDescription.text.toString())
            intent.putExtra("ImageID",2)

            startActivity(intent)
        }
        binding.birdBtn.setOnClickListener {
            val intent = Intent(this, DescriptionActivity::class.java)

            intent.putExtra("Film", binding.AvatarView.text.toString())
            intent.putExtra("Description", binding.birdDescription.text.toString())
            intent.putExtra("ImageID",3)

            startActivity(intent)
        }
    }
}