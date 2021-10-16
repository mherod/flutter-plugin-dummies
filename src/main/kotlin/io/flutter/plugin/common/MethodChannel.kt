package io.flutter.plugin.common

class MethodChannel(binaryMessenger: Any, s: String) {
    fun setMethodCallHandler(plugin: MethodCallHandler?) {

    }

    interface MethodCallHandler {
        fun onMethodCall(call: MethodCall, result: Result)
    }

    interface Result {
        fun success(s: Any)
        fun notImplemented()
    }
}
