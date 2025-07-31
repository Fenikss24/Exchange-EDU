package com.example.domain.repository

import com.example.domain.Country

interface CountryRepository {
    suspend fun getAllCountries(): List<Country>

}