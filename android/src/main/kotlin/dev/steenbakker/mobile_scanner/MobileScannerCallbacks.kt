package dev.steenbakker.mobile_scanner

import dev.steenbakker.mobile_scanner.objects.MobileScannerStartParameters

typealias MobileScannerCallback = (barcodes: List<Map<String, Any?>>, image: ByteArray?, width: Int?, height: Int?, sensorRotationDegrees : Int?, relativeSensorRotationDegrees : Int?, originalWidth: Double?, originalHeight: Double?) -> Unit
typealias AnalyzerCallback = (barcodes: List<Map<String, Any?>>?) -> Unit
typealias MobileScannerErrorCallback = (error: String) -> Unit
typealias TorchStateCallback = (state: Int) -> Unit
typealias ZoomScaleStateCallback = (zoomScale: Double) -> Unit
typealias MobileScannerStartedCallback = (parameters: MobileScannerStartParameters) -> Unit