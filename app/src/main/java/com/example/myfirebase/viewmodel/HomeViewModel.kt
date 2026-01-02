package com.example.myfirebase.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

sealed interface StatusUiSiswa {
    data class Success(val siswa: List<Siswa> = listOf()) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}
class HomeViewModel(private val repositorySiswa: RepositorySiswa): ViewModel() {
    var statusUiSiswa: StatusUiSiswa by mutableStateOf(StatusUiSiswa.Loading)
        private set
}