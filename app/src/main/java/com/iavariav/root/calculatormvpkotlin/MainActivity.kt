package com.iavariav.root.calculatormvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    lateinit var presenterImp: HitungPresenterImp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {
        btnTambah.setOnClickListener {
            presenterImp.hitungTambah(edtNilai1, edtNilai2)
        }
        btnKurang.setOnClickListener {
            presenterImp.hitungKurang(edtNilai1, edtNilai2)
        }
        btnKali.setOnClickListener {
            presenterImp.hitungKali(edtNilai1, edtNilai2)
        }
        btnbagi.setOnClickListener {
            presenterImp.hitungBagi(edtNilai1, edtNilai2)
        }
    }

    private fun initPresenter() {
        presenterImp = HitungPresenterImp(this)
    }

    override fun kosong() {
        Toast.makeText(this, "Kosong" , Toast.LENGTH_SHORT).show()
    }

    override fun hasil(nilai: String) {
        tvHasil.text = nilai
    }
}
