package oop_00000101285_emanueldavidseptianohermawan.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

// Serialization (Object -> CSV)
fun Student.toCsv(): String = "$name. $age, $gpa"

// Deserialization (CSV -> Object)
fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

fun saveStudents(students: List<Student>, path: String){
    File(path).writeText(students.joinToString("\n") { it.toCsv() })
}

fun loadStudents(path: String) : List<Student>{
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        emptyList()
    }
}