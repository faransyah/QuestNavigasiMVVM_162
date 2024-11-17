package com.example.pertemuan5.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.pertemuan5.model.Mahasiswa


@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa,
    navController: NavHostController
) {
    Column(modifier = Modifier.fillMaxSize()) {
        TampilData(
            judul = "nama",
            isinya = mhs.nama
        )
        TampilData(
            judul = "gender",
            isinya = mhs.gender
        )
        TampilData(
            judul = "Alamat",
            isinya = mhs.alamat
        )
        TampilData(
            judul = "NIM",
            isinya = mhs.nim
        )
        TampilData(
            judul = "No HP",
            isinya = mhs.noHp
        )
        TampilData(
            judul = "Email",
            isinya = mhs.email
        )
        Button(onClick = { navController.popBackStack() },
            modifier = Modifier.padding(16.dp)) {
            Text("Backk")
        }
    }
}


@Composable
fun TampilData(
    judul:String,
    isinya:String
){
    Row(modifier = Modifier.fillMaxWidth()
        .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(isinya,  modifier = Modifier.weight(2f))
    }
}