package com.shin.lec09

import com.lannstark.lec09.JavaPerson

class Person constructor(name: String, age: Int,) {

    val name = name
    var age = age
}

class Person2 (name: String, age: Int,) {

    val name = name
    val age = age
}

class Person3(
    name: String,
    var age: Int,
) {

    val name = name
        get() = field.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20
}

fun main() {
    val person = Person3("이신광", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    val javaPerson = JavaPerson("최태현", 31)
    println(javaPerson.name)
    javaPerson.age = 55
    println(javaPerson.age)

    val person2 = Person3("김솔이")
    Person3()
    Student()

    person2.isAdult
}

class Student