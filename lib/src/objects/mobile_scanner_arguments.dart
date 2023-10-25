import 'package:flutter/material.dart';

/// The start arguments of the scanner.
class MobileScannerArguments {
  /// The output size of the camera.
  /// This value can be used to draw a box in the image.
  final Size size;

  /// A bool which is true if the device has a torch.
  final bool hasTorch;

  /// The texture id of the capture used internally.
  final int? textureId;

  /// The texture id of the capture used internally if device is web.
  final String? webId;

  final int sensorRotationDegrees;
  final int relativeSensorRotationDegrees;
  final double originalWidth;
  final double originalHeight;

  MobileScannerArguments({
    required this.size,
    required this.hasTorch,
    this.textureId,
    this.webId,
    this.sensorRotationDegrees = 0,
    this.relativeSensorRotationDegrees = 0,
    this.originalWidth = 0,
    this.originalHeight = 0,
  });
}
