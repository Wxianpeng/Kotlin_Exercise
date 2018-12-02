package com.mibook.dinterface

fun main(args: Array<String>) {
    print("请输入第一个数字:")

    var m: Int = 0
    var n: Int = 0
    m = readLine()?.toInt() ?: -1
    print("请输入第二个数字:")
    n = readLine()?.toInt() ?: -1
    println("m+n=" + (m + n))


}

