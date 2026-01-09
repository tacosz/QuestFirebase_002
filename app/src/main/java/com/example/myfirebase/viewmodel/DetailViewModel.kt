@file:OptIn(InternalSerializationApi::class)

package com.example.myfirebase.viewmodel

import com.example.myfirebase.modeldata.Siswa
import kotlinx.serialization.InternalSerializationApi

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}