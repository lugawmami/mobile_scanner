package dev.steenbakker.mobile_scanner.objects

class MobileScannerStartParameters(
    val width: Double = 0.0,
    val height: Double,
    val hasFlashUnit: Boolean,
    val id: Long,
    val sensorRotationDegrees: Int,
    val relativeSensorRotationDegrees: Int,
    val originalWidth: Double = 0.0,
    val originalHeight: Double = 0.0
)