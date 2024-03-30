package com.lnight.realmdb

import android.app.Application
import com.lnight.realmdb.models.Address
import com.lnight.realmdb.models.Course
import com.lnight.realmdb.models.Student
import com.lnight.realmdb.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application() {

    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class
                )
            )
        )
    }
}