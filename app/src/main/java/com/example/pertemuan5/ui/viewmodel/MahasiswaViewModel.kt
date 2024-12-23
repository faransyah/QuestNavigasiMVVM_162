package com.example.pertemuan5.ui.viewmodel


import androidx.lifecycle.ViewModel
import com.example.pertemuan5.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(Mahasiswa())

    val uistate : StateFlow<Mahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa (
        ls : MutableList<String>
    )
    {
        _uiState.update { data ->
            data.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2],
                nim = ls[3],
                email = ls[4],
                noHp = ls[5],
            )
        }
    }

}