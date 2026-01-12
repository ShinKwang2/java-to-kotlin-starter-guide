package com.shin.lec02

import com.lannstark.lec02.Person

fun main() {

    val str: String? = "ABC"
    // str.length // 불가능
    str?.length // 가능 ?. = Safe Call
    println(str?.length)
    // null이 아니면 실행하고, null 이면 실행하지 않는다(그대로 null)

    println(str?.length ?: 0)

    println(startWith("DEF"))

    val person = Person(null)
    startsWith_Person(person.name)
}

fun startsWith_Person(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA1_refactor(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA2_refactor(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWithA3_refactor(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun calculate(number: Long?): Long {
    number ?: return 0
    return number +10
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}