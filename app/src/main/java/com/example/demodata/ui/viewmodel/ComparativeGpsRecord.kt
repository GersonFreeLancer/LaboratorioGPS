package com.example.demodata.ui.viewmodel


import com.example.demodata.data.local.entity.GpsGoogleEntity
import com.example.demodata.data.local.entity.GpsSensorsEntity

data class ComparativeGpsRecord(
    val timestamp: Long,
    val google: GpsGoogleEntity?,
    val sensors: GpsSensorsEntity?
)
