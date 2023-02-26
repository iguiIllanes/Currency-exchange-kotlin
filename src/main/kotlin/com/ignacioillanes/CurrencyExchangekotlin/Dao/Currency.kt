package com.ignacioillanes.CurrencyExchangekotlin.Dao

import java.math.BigDecimal
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "currency")
class Currency (
    var currencyFrom : String,
    var currencyTo : String,
    var amount : BigDecimal,
    var result : BigDecimal,
    var date : Date,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Long = 0,
){
    constructor() : this("", "", BigDecimal.ZERO, BigDecimal.ZERO, Date())
}