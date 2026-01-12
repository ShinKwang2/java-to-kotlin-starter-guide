package com.shin.lec03

import com.lannstark.lec03.Person

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble()
    println(result)

    // 변수가 nullable이라면 적절한 처리가 필요하다
    val number5: Int? = 3
    val number6: Long = number5?.toLong() ?: 0L

    printAgeIfPerson_null(null)
    printAgeIfPerson_null(Person("", 100))

    val person = Person("최태현", 100)
    val name = "최태현"
    println("이름 : ${person.name}, 나이 : ${person.age}")
    println("이름 : $name")

    val str = """
        ABC
        DEF
        ${name}
    """.trimIndent()
    println(str)

    var abc = "ABC"
    println(abc[0])
    println(abc[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson_smartCast(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfNotPerson(obj: Any) {
    if (!(obj is Person)) {
        // do something
    }
    if (obj !is Person) {
        // do something
    }
}

fun printAgeIfPerson_null(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.age)
}