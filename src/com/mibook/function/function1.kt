package com.mibook.function


/**
 * 函数式变成  函数式一等公民，函数可以独立于对象单独存在
 */

//顶层函数


fun sayHello() {


}

fun sayHello(name: String) {

    println("Hello%s$name")
}

fun getLength(name: String): Int {

    return name.length
}


fun main(args: Array<String>) {
    val creatDiary = creatDiary("保安公园")
    println(creatDiary)

}

fun creatDiary(place: String): String {

    return "今天天气晴朗，万里无云，我们去${place}游玩，首先引入眼帘的是$place${place.length}个镏金大字"
}


//kotlin   的 if 是有返回值   ，kotlin  没有三元运算符

// kotlin  一般都是返回值的  闭包 概念


fun max(num1: Int, num2: Int): Int {

    return if (num1 > num2) num1 else num2
}