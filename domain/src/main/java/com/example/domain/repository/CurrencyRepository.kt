package com.example.domain.repository

import com.example.domain.Rate

interface CurrencyRepository {
    suspend fun getCurrencyRates(currency: String): Rate?

}