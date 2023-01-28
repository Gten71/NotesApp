package com.example.notesapp.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "notes_table")
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "note") var note: String,
    @ColumnInfo(name = "date") var date: String?
): java.io.Serializable
