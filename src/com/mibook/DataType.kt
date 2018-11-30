package com.mibook

/**
 * 在项目开发中尽量使用 val, 如果不能使用val时候， 在考虑var  ，  保证程序的安全性
 */
//可通过反射来修改值
const val mm = 20

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

    //5 可变变量  不可变变量

    //var 可变 运行时可变
    var aaa = 10
    aaa = 20
    //var 不可变  运行时不可变 ， 反射可以修改里面的值
    val aab = 10
    //aab = 20

    // 6 字符串

    val name = "张三"
    val address = "广东省\n深圳市\n宝安区"
    println(name)
    println(address)

    //原样输出字符串
    val words = """
          |中华人名
          |共和国
    """.trimMargin("|").trim()
    println(words)

    // 7字符串比较




}