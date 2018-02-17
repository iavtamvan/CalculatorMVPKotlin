package com.iavariav.root.calculatormvpkotlin

import android.widget.Button
import android.widget.EditText

/**
 * Created by root on 2/17/18.
 */
class HitungPresenterImp : HitungPresenter {
    var modelView : MainView? = null

    constructor(modelView: MainView?) {
        this.modelView = modelView
    }

    override fun hitungTambah(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()


        if (a.isNotEmpty() || b.isNotEmpty()){
            var valuee1 = a.toInt()
            var value2 = b.toInt()

            var hasil = valuee1 + value2
            modelView?.hasil(hasil.toString())
        }

    }

    override fun hitungKurang(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()


        if (a.isNotEmpty() || b.isNotEmpty()){
            var valuee1 = a.toInt()
            var value2 = b.toInt()

            var hasil = valuee1 - value2
            modelView?.hasil(hasil.toString())
        }
    }

    override fun hitungKali(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()


        if (a.isNotEmpty() || b.isNotEmpty()){
            var valuee1 = a.toInt()
            var value2 = b.toInt()

            var hasil = valuee1 * value2
            modelView?.hasil(hasil.toString())
        }
    }

    override fun hitungBagi(nilai1: EditText, nilai2: EditText) {

        var a = nilai1.text.toString()
        var b = nilai2.text.toString()


        if (a.isNotEmpty() || b.isNotEmpty()){
            var valuee1 = a.toInt()
            var value2 = b.toInt()

            var hasil = valuee1 / value2
            modelView?.hasil(hasil.toString())
        }
    }
}