package com.example.itunes.data

import com.example.itunes.data.entities.Song

data class ApiResponse(
    var resultCount: Int,
    var results: List<Song>

)