package br.com.dio.coinconverter.data.repository

import br.com.dio.coinconverter.data.model.ExchangeResponseValue
import kotlinx.coroutines.flow.Flow

interface CoinRepository {
    suspend fun getExchangeValue(coins: String): Flow<ExchangeResponseValue>
}