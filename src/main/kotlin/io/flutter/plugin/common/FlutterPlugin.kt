package io.flutter.plugin.common

interface FlutterPlugin {
    interface FlutterPluginBinding {
        val binaryMessenger: Any
    }

    fun onAttachedToEngine(binding: FlutterPluginBinding)
    fun onDetachedFromEngine(binding: FlutterPluginBinding)
}
