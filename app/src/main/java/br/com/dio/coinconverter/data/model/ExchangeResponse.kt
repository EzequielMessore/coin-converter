package br.com.dio.coinconverter.data.model

import androidx.room.Entity

typealias ExchangeResponse = HashMap<String, ExchangeResponseValue>

@Entity(tableName = "tb_exchange")
data class ExchangeResponseValue (
    val code: String,
    val codein: String,
    val name: String,
    val high: String,
    val low: String,
    val varBid: String,
    val pctChange: String,
    val bid: Double,
    val ask: String,
    val timestamp: String,
    val createDate: String
)