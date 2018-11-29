package com.mibook

import java.math.BigDecimal

fun main(args: Array<String>) {
    var money: Double = 1.234567891234567890

    //数据存不下的时候
    println(money)


    //使用BigDecimal 科学计数
    var big: BigDecimal = BigDecimal("1.234567891234567890")

    println(big)
}