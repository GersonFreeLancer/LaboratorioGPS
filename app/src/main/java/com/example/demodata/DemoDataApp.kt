package com.example.demodata

import android.app.Application
import androidx.room.Room
import com.example.demodata.data.local.database.AppDatabase
import com.example.demodata.data.repository.GpsRepository

class DemoDataApp : Application() {

    lateinit var database: AppDatabase
        private set

    lateinit var gpsRepository: GpsRepository
        private set

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "demodata.db"
        )
            .fallbackToDestructiveMigration()
            .build()

        gpsRepository = GpsRepository(
            database.gpsGoogleDao(),
            database.gpsSensorsDao()
        )
    }
}