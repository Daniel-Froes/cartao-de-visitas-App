package me.daniel.businesscard

import android.app.Application
import me.daniel.businesscard.data.AppDatabase
import me.daniel.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}