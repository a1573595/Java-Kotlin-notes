package oo

open class Being
open class Person: Being()
class Student: Person()

fun main(args: Array<String>) {
    // Covariance = we can use a "more derived" type (a subtype)
    val people: MutableList<Person> = mutableListOf(Person(), Student())
    // Being dose not fulfill the contract of class Person
    people.add(Person())
    people.add(Student())
    //people.add(Being())

    val students: List<Person> = listOf<Student>()
    // Error
//    val student2: MutableList<Person> = mutableListOf<Student>()
//    student2.add(Person())
//    student2.add(Student())

    val events: TimeLine<Person> = TimeLine()
    events.addAll(students)
}