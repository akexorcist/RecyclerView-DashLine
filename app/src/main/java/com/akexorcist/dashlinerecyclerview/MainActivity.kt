package com.akexorcist.dashlinerecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akexorcist.dashlinerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding.rvContent) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AndroidInfoAdapter(getAndroidInfoList())
        }
    }

    private fun getAndroidInfoList() = listOf(
        AndroidInfo(
            "Android 1.6 Donut",
            "Donut brought the word's information to your fingertips with the Quick Search Box.",
            "September 15, 2009"
        ),
        AndroidInfo(
            "Android 2.1 Eclair",
            "With Eclair high density displays showed off stunning live wallpapers that respond to your touch. Drive anywhere with turn-by-turn navigation and real-time traffic information, right from your phone.",
            "October 26, 2009"
        ),
        AndroidInfo(
            "Android 2.2 Froyo",
            "Froyo unveiled lightning fast phones that can be controlled by the sound of your voice and hotspot capabilities ensured you're always connected on the go.",
            "May 20, 2010"
        ),
        AndroidInfo(
            "Android 2.3 Gingerbread",
            "Gingerbread made the Android experience simpler and faster for both users and developers.",
            "December 6, 2010"
        ),
        AndroidInfo(
            "Android 3.0 Honeycomb",
            "Honeycomb ushered in the era of tablets with a flexible interface design that showcases large imagery and seamless on-screen navigation.",
            "February 22, 2011"
        ),
        AndroidInfo(
            "Android 4.0 Ice Cream Sandwich",
            "Ice Cream Sandwich upped the ante on customization and user control - tailor your home screen, define how much data you use and instantly share content when you want.",
            "October 18, 2011"
        ),
        AndroidInfo(
            "Android 4.1 Jelly Bean",
            "Intelligence permeated all facets of Jelly Bean which ushered in the era of personalized mobile assistance with Google Now. It also made notifications more actionable and allowed one device to work for multiple user accounts.",
            "July 9, 2012"
        ),
        AndroidInfo(
            "Android 4.4 KitKat",
            "Android KitKat helped you get things done with just the sound of your voice - just say \"Ok Google\" to launch voice search, send a text, get directions, or even play a song. And when you are hands on with your device, a new immersive design brings your content to center stage.",
            "October 31, 2013"
        ),
        AndroidInfo(
            "Android 5.0 Lollipop",
            "Android arrives on screens big and small - from phones and tablets to watches, TVs and cars. Lollipop has a bold visual style and the fluid tactile response of Material Design.",
            "November 12, 2014"
        ),
        AndroidInfo(
            "Android 6.0 Marshmallow",
            "Now there's s'more to love about your mobile device: easy shortcut to smart answers with Now on Tap, battery life that can last longer and new app permissions that give you more control.",
            "October 5, 2015"
        )
    )
}
