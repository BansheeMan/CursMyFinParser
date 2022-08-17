package com.example.cursmyfinparser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cursmyfinparser.databinding.ActivityMainBinding
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var doc : Document

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.textView.text =  "Дарова"
    }
}