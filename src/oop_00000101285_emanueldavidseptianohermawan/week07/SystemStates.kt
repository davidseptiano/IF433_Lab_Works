package oop_00000101285_emanueldavidseptianohermawan.week07

import javax.annotation.processing.Messager
import javax.xml.crypto.Data

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}