package com.example.notes

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)                 //To make the function perform only unique insert operation
    fun insert(note: Note)                      //suspend is a Coroutine which manages the background processes

    @Delete                 //To make the function perform delete operation
    fun delete(note: Note)                      //it can be called only by a suspend function or by background thread

    @Query("Select * from notes_table order by id ASC")                //To make the function show all items
    fun getAllNotes(): LiveData<List<Note>>             //Live Data can be observed from anywhere. Any change made in list will be visible to observer
}