package com.example.myfirebase.repositori

import android.app.Application

interface ContainerApp {
    val repositorySiswa: ReposirotySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositorySiswa: ReposirotySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}

class AplikasiDataSiswa : Application() {
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}