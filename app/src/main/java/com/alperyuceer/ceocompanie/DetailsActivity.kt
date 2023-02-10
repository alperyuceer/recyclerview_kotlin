package com.alperyuceer.ceocompanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alperyuceer.ceocompanie.databinding.ActivityDetailsBinding
import java.util.Random

private lateinit var binding: ActivityDetailsBinding
class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //casting
        val selectedCeos = intent.getSerializableExtra("ceolar") as Ceo
        println(selectedCeos.ceoName)
        binding.ceoImage.setImageResource(selectedCeos.ceoImage)
        binding.ceoNameText.text=selectedCeos.ceoName
        binding.detailsText.text = selectedCeos.company
    }


}
