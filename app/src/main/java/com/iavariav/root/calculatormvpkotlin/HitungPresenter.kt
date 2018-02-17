package com.iavariav.root.calculatormvpkotlin

import android.widget.Button
import android.widget.EditText

/**
 * Created by root on 2/17/18.
 */
interface HitungPresenter {
    fun hitungTambah(nilai1: EditText, nilai2 : EditText)
    fun hitungKurang(nilai1: EditText, nilai2 : EditText)
    fun hitungKali(nilai1: EditText, nilai2 : EditText)
    fun hitungBagi(nilai1: EditText, nilai2 : EditText)
}