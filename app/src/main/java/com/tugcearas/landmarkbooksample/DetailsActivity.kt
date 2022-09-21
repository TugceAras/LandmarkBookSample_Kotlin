package com.tugcearas.landmarkbooksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.landmarkbooksample.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val getIntent = intent

        //Casting
        //val selectedLandmark = intent.getSerializableExtra("Landmark") as Landmark

        val selectedLandmark = LandmarkSingleton.chosenLandmark
        selectedLandmark?.let {
            binding.LandmarkNameTextView.text = it.name
            binding.landmarkCountryTextView.text = it.country
            binding.LandmarkImageView.setImageResource(it.landmarkImage)
        }

    }

}