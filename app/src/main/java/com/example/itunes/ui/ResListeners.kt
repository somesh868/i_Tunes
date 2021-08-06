package com.example.itunes.ui

import com.example.itunes.data.entities.Song

interface ResListeners {
    fun onFailure(msg: String)

    fun onSuccess()
    fun processRV(songs: List<Song>, of: String)
}