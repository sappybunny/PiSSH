package com.example.pissh.views

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.pissh.R
import com.example.pissh.databinding.ActivityConnectionDetailsBinding
import com.example.pissh.viewmodels.ConnectionDetailsViewModel

class ConnectionDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConnectionDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConnectionDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val activityMainBinding: ActivityConnectionDetailsBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_connection_details)

        activityMainBinding.viewModel = ConnectionDetailsViewModel()
        activityMainBinding.executePendingBindings()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}