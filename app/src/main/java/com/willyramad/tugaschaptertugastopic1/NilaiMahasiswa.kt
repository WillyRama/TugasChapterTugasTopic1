package com.willyramad.tugaschaptertugastopic1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_nilai_mahasiswa.*


class NilaiMahasiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai_mahasiswa)

        btnHitung.setOnClickListener{
            var nama = edNama.text.toString()
            var nim = edNim.text.toString()
            var uas = edUas.text.toString().toInt()
            var uts = edUts.text.toString().toInt()
            var tugas = edTugas.text.toString().toInt()
            var Hitung = (uas + uts + tugas) / 3
            var total = (uas + uts + tugas )

            if (Hitung in 0..60){
                nilai.text = "Nama Mahasiswa : $nama" +
                        "\nNim : $nim" +
                        "\nUAS : $uas" +
                        "\nUTS : $uts" +
                        "\nTugas : $tugas" +
                        "\nTotal : $total" +
                        "\nRata-Rata Nilai : $Hitung" +
                        "\nNilai Huruf : F" +
                        "\nStatus : Tidak Lulus"
            }else if (Hitung in 61..70) {
                nilai.text = "Nama Mahasiswa : $nama" +
                        "\nNim : $nim" +
                        "\nUAS : $uas" +
                        "\nUTS : $uts" +
                        "\nTugas : $tugas" +
                        "\nTotal : $total" +
                        "\nRata-Rata Nilai : $Hitung" +
                        "\nNilai Huruf : D" +
                        "\nStatus : Tidak Lulus"
            }else if (Hitung in 71..80){
                nilai.text = "Nama Mahasiswa : $nama" +
                        "\nNim : $nim" +
                        "\nUAS : $uas" +
                        "\nUTS : $uts" +
                        "\nTugas : $tugas" +
                        "\nTotal : $total" +
                        "\nRata-Rata Nilai : $Hitung" +
                        "\nNilai Huruf : C" +
                        "\nStatus : Lulus"
            }else if (Hitung in 81..90){
                nilai.text = "Nama Mahasiswa : $nama" +
                        "\nNim : $nim" +
                        "\nUAS : $uas" +
                        "\nUTS : $uts" +
                        "\nTugas : $tugas" +
                        "\nTotal : $total" +
                        "\nRata-Rata Nilai : $Hitung" +
                        "\nNilai Huruf : B" +
                        "\nStatus : Lulus"
            }else if (Hitung in 91..100) {
                nilai.text = "Nama Mahasiswa : $nama" +
                        "\nNim : $nim" +
                        "\nUAS : $uas" +
                        "\nUTS : $uts" +
                        "\nTugas : $tugas" +
                        "\nTotal : $total" +
                        "\nRata-Rata Nilai : $Hitung" +
                        "\nNilai Huruf : A" +
                        "\nStatus : Lulus"
                }
            }
            btnReset.setOnClickListener {
                reset()
        }
    }
    fun reset(){
        edNama.setText("")
        edNim.setText("")
        edUas.setText("")
        edUts.setText("")
        edTugas.setText("")

    }
}
