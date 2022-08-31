package com.willyramad.tugaschaptertugastopic1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator_bmi.*

class CalculatorBmi : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_bmi)

        btnhitung.setOnClickListener{
            var edumur = edumur.text.toString().toInt()
            var edtb = edTb.text.toString().toDouble()
            var edbb = edBb.text.toString().toDouble()
            var hasil = edbb/((edtb * edtb)/10000)

            if (hasil< 16.0){
                text.text =  "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Terlalu Kurus"
                } else if (hasil>=16 && hasil<17){
                text.text = "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Cukup Kurus"
                } else if (hasil>=17 && hasil<18.5){
                text.text = "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Sedikit Kurus"

                } else if (hasil>=18.5 && hasil<25){
                text.text = "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Normal"

                } else if (hasil>=25 && hasil<30){
                text.text = "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Gemuk"

                } else if (hasil>=30 && hasil<35){
                text.text = "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Obesitas Kelas I"

                } else if (hasil>=35 && hasil<40){
                text.text = "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Obesitas Kelas II"
                } else if (hasil>= 40.0){
                    text.text = "Umur Anda :$edumur tahun"+
                            "\nTinggi :${edtb.toInt()} cm"+
                            "\nBerat Badan :${edbb.toInt()} kg"+
                            "\nBMI Anda :$hasil"+
                            "\nKategori : Obesitas Kelas III"
                }
            }
            btnReset.setOnClickListener {
                reset()
        }
    }
    fun reset(){
        edumur.setText("")
        edTb.setText("")
        edBb.setText("")

    }
}