package com.example.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")              //Creates the table of note class in SQLite
class Note(@ColumnInfo(name = "text")val text: String)          //@ColumnInfo creates the name of column
{
    @PrimaryKey(autoGenerate = true) var id = 0             //@PrimaryKey make a variable primary key; autoGenerate for auto increment
}                                                   //DAO is used to access the table