package com.mibook

fun main(args: Array<String>) {

//    1. 基本数据类型  没有包装数据类型

    /**
     *Double   8byte
     *Long     8byte
     *Int      4byre
     *Float    4byte
     *Short    2bte=16bit
     *Char     2byte
     *Byte     1byte=8bit
     *Boolean  1byte
     */

    var a: Double = 1.2345678
    var b: Long = 1234567869
    var c: Int = 123456
    var d: Float = 3.14f
    var e: Short = 10
    var f: Char = 'a'
    var g: Byte = 'a'.toByte()
    var h: Boolean = false
    var i: String = "hello kotlin "


    val hashCode = b.hashCode()
    println(hashCode)

    print(a + b + c + d + e)
    print("" + f + g + h + i)
//  2. 2进制计数

    /**
     *  1位:  0  1  两种状态  （表示一个bit）
     *  2位: 00 01 10 11 四种状态
     *
     *  2的n次方
     */
// 3 智能类型推断 (不用申明类型， 自动推断)

    var aa = 10

    var bb = "aa"

    // 4 类型转换

    var dd = 10

    var dl = 10L
    var ds = "20"


    //不同数据类型不能直接转换 ， 但是可以通过 toXXX 转换
    dl = dd.toLong()   //Int 的值 赋值给Long

    dd = dl.toInt()    //Long 的值 赋值给Int

    println(ds.toInt())

    //kotlin  类型检查最严格 ，  java只能小的赋值给大的   ，js 基本不检查

}