package br.com.dio.coinconverter.data.repository

import br.com.dio.coinconverter.data.services.AwesomeService
import kotlinx.coroutines.flow.flow

class CoinRepositoryImpl(
    private val service: AwesomeService
) : CoinRepository {

    override suspend fun getExchangeValue(coins: String) = flow {
        val exchangeValue = service.exchangeValue(coins)
        val exchange = exchangeValue.values.first()
        emit(exchange)
    }
}