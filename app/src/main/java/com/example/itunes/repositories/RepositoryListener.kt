package com.example.itunes.repositories

import com.example.itunes.data.ApiResponse

interface RepositoryListener {
    fun onSuccess(res: ApiResponse, of: String)
}