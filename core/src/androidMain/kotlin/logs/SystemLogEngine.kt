package com.juul.kable.logs

import android.util.Log

public actual object SystemLogEngine : LogEngine {
    override fun verbose(throwable: Throwable?, tag: String, message: String) {
        Log.v(tag, message, throwable)
    }

    override fun debug(throwable: Throwable?, tag: String, message: String) {
        Log.d(tag, message, throwable)
    }

    override fun info(throwable: Throwable?, tag: String, message: String) {
        Log.i(tag, message, throwable)
    }

    override fun warn(throwable: Throwable?, tag: String, message: String) {
        Log.w(tag, message, throwable)
    }

    override fun error(throwable: Throwable?, tag: String, message: String) {
        Log.e(tag, message, throwable)
    }

    override fun assert(throwable: Throwable?, tag: String, message: String) {
        Log.wtf(tag, message, throwable)
    }
}
