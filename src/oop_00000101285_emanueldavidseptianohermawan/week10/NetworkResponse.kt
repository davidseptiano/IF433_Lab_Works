package oop_00000101285_emanueldavidseptianohermawan.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)