package com.example.data.repository

import com.example.domain.Rate
import com.example.domain.repository.CurrencyRepository

class CurrencyRepositoryImpl : CurrencyRepository {

    override suspend fun getCurrencyRates(currency: String): Rate {

    }
}
