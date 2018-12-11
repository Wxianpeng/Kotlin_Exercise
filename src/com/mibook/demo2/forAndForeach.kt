package com.mibook.demo2

/**
 * continue he break 只能用在 for循环里面 不能用在foreach里面
 */
fun main(args: Array<String>) {
    val str = "abcde"

    //for 循环

    for (a in str) {

        if (a == 'a') {
            continue
        } else if (a == 'd') {
            break
        }
        println(a)
    }

    for ((index, a) in str.withIndex()) {

        println("index=$index,c=$a")
    }

    //foreach  高级循环
    str.forEach {
        println(it)
    }

    str.forEachIndexed { index, c ->
        println("index=$index,c=$c")

    }

    val str1 = "abc"

    val str2 = "123"


}