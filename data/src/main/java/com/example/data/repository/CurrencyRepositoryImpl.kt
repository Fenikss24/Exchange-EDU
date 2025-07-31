package com.example.data.repository

import com.example.data.network.NetworkService
import com.example.domain.Rate
import com.example.domain.repository.CurrencyRepository

class CurrencyRepositoryImpl(
    private val networkService: NetworkService
) : CurrencyRepository {

    override suspend fun getCurrencyRates(currency: String): Rate? {
        val rates = try {
            networkService.getRate(currency)
        } catch (_: Exception) {
            null
        }
        return rates
    }
}
