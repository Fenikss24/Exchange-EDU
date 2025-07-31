package com.example.data.repository

import com.example.data.network.NetworkService
import com.example.domain.Country
import com.example.domain.repository.CountryRepository

class  CountryRepositoryImpl(
    private val networkService: NetworkService
) : CountryRepository {
    override suspend fun getAllCountries(): List<Country> {

        val countries = try {
            networkService.getCountries()
        } catch (_: Exception){
            emptyList()
        }
        return countries
    }
}