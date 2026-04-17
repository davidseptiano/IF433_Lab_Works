package oop_00000101285_emanueldavidseptianohermawan.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // INI AKAN ERROR: Type mismatch

        if (user.email != null) {
            // SUCCESS via Smart cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}