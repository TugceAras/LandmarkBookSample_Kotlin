package com.tugcearas.landmarkbooksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.landmarkbooksample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarkList = ArrayList<Landmark>()
        getData()
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.landmarkRecyclerView.adapter = landmarkAdapter

    }
    private fun getData(){
        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum = Landmark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel = Landmark("Eiffel Tower","France",R.drawable.eiffeltower)
        val londonBridge = Landmark("London Bridge","UK",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)
    }
}