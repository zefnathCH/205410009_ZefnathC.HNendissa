package com.example.catatan.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

//bagian adalah bagian pola untuk membuat note baru
@Entity(tableName = "notes")
class ModelNote : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id = 0

    @ColumnInfo(name = "title")  //apakah bagian title kosong atau tidak
    var title: String? = null

    @ColumnInfo(name = "date_time") //apakah bagian date_time kosong atau tidak
    var dateTime: String? = null

    @ColumnInfo(name = "sub_title") //apakah bagian sub_title kosong atau tidak
    var subTitle: String? = null

    @ColumnInfo(name = "note_text") //apakah bagian note_text kosong atau tidak
    var noteText: String? = null

    @ColumnInfo(name = "image_path") //apakah bagian image_path kosong atau tidak
    var imagePath: String? = null

    @ColumnInfo(name = "color") //apakah color kosong atau tidak
    var color: String? = null

    @ColumnInfo(name = "web_url") //apakah web_url kosong atau tidak
    var url: String? = null
    override fun toString(): String {
        return "$title : $dateTime"
    }
}