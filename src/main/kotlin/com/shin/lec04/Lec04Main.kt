package com.shin.lec04

import com.lannstark.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(3000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 큽니다")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4)
    println(money3 === money5)
    println(money3 == money5)

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}
fun fun2(): Boolean {
    println("fun 2")
    return false
}