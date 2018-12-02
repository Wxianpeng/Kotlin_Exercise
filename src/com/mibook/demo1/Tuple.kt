package com.mibook.demo1

/**
 * 数组 集合 对象
 * <p>
 * 元组    {2元元组 ， 3元元组}
 */

fun main(args: Array<String>) {

    //1元组

    //   2元 元组
    //pair  和 pair1 方式 相同 ， pair1 是简答写法
    val pair = Pair<String, Int>("张三", 20)
    val pair1 = "张三" to 20
    println(pair.first)
    println(pair.second)

    //3元元组
    val tripe = Triple<String, Int, String>("张三", 10, "11111111")

    val triple1 = "张三" to 10 to 11111111
    println(tripe.first)

    println(tripe.second)

    println(tripe.third)

    //2 null process


    //val str: String? 可空类型
    //val str: String  非空类型

    val str: String? = null


    //告诉编译器， 不用检查， 但是可能发生空指针异常
    //str!!.toInt()

    val toInt= str?.toInt() ?: -1    //Elvis( ?: ) 操作符

    println(toInt)

    println(str?.toInt())

    println(str)


}