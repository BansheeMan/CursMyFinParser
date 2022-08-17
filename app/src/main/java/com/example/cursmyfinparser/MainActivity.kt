package com.example.cursmyfinparser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cursmyfinparser.databinding.ActivityMainBinding
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var doc : Document

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }


        Thread { getWeb() }.start()
        //binding.textView.text =  doc.title().toString()
        Log.d("@@@", "####################################")

    }

    private fun getWeb() {
        doc = Jsoup.connect("https://myfin.by/currency/minsk").get()
        val table = doc.getElementsByTag("tbody")
        val ourTable = table[0]
        val elementsFromTable = ourTable.children()[0].text()
        val elem_dollar = ourTable.children()[0].children()[1].text()

        Log.d("@@@", "Title: ${doc.title()}")
        Log.d("@@@", "####################################")
        Log.d("@@@", "${elementsFromTable}")
        Log.d("@@@", "####################################")
        Log.d("@@@", "${elem_dollar}")


    }
}