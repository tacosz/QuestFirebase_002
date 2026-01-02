package com.example.myfirebase.repositori

interface ContainerApp {
    val repositorySiswa: ReposirotySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositorySiswa: ReposirotySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}