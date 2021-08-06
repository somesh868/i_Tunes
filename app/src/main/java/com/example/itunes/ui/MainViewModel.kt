package com.example.itunes.ui

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.itunes.data.ApiResponse
import com.example.itunes.repositories.RepositoryListener
import com.example.itunes.repositories.SongRepository

class MainViewModel(
    val repository: SongRepository,

    ) : ViewModel() {

    var artist: String? = null
    var listeners: ResListeners? = null
    var _res: ApiResponse? = null


    fun onSearchClick(view: View) {

        repository.listener = object : RepositoryListener {
            override fun onSuccess(res: ApiResponse, of: String) {
                _res = res
                listeners?.processRV(res.results, of)

            }
        }
        if (artist.isNullOrEmpty()) {
            listeners?.onFailure("No results found :(")
            return
        }

        repository.getSongs(artist!!)

    }
}