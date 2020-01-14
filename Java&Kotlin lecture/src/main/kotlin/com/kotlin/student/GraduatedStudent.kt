package com.kotlin.student

class GraduatedStudent constructor(id: String, name: String? , english: Int, math: Int, var thesis: Int) :
    Student(id, name, english, math) {
    companion object {
        const val PASS = 70
    }

    override fun showScore() {
        val average = getAverage()
        println("$name\tEnglish:$english\tMath:$math\tThesis:$thesis")
        println(if(average > PASS) "PASS" else "FAILED")

        val grading: Char = when (average) {
            in 90 .. 100 -> 'A'
            in 80 .. 89 -> 'B'
            in 70 .. 79 -> 'C'
            in 60 .. 69 -> 'D'
            else -> 'E'
        }

        println("\t" + grading)
    }

    override fun getHighest(): Int {
        return if(english >= math && english >= thesis){
            print("English ")
            english
        }else if(math >= english && math >= thesis){
            print("Math ")
            math
        } else {
            print("Thesis ")
            thesis
        }
    }

    override fun getAverage(): Int = (english + math + thesis) / 3
}