package br.com.dio.coinconverter.data.services

import retrofit2.http.GET
import retrofit2.http.Path

interface AwesomeService {

    @GET("/json/last/{coins}")
    suspend fun exchangeValue(@Path("coins") coins: String)

}