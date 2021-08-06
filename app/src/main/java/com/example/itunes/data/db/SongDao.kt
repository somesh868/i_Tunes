package com.example.itunes.data.db

import androidx.room.*
import com.example.itunes.data.entities.Song

@Dao
interface SongDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(songs: List<Song>)

    @Query("SELECT * FROM Song WHERE artistName LIKE :name LIMIT 10")
    fun getSongs(name: String): List<Song>


}