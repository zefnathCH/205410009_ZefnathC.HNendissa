package com.example.catatan.onClick

import com.example.catatan.Model.ModelNote

interface onClickItemListener {
    fun onClick(modelNote: ModelNote, position: Int)
}