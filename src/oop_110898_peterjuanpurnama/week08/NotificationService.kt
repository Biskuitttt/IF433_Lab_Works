package oop_110898_peterjuanpurnama.week08

class NotificationService {

    fun sendEmail(user: UserProfile) {
        if (user.email != null) {
            println("Sending email to ${user.email}")
        }
    }
}