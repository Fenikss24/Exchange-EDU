package com.example.data

import com.example.data.network.NetworkService
import com.example.data.repository.CountryRepositoryImpl
import org.koin.dsl.module
import retrofit2.Retrofit


object DataModule {
    val module = module {
        single {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .build()
            val service: NetworkService? = retrofit.create(NetworkService::class.java)
            service
        }
        factory {
            CountryRepositoryImpl(get())
        }
    }
}