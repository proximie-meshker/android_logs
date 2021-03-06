package com.eshker.logtofiletest

import android.content.Context
import timber.log.Timber
import java.io.File
import java.text.ParseException

//region save logs to file

fun createTodayLogDir(context: Context) {
    var rootDir = context.getFilesDir()
    var logDir = File(rootDir, "logs_root")
    logDir.mkdir()
}

class CrashlyticsTree : Timber.Tree() {

    /**
     * Write a log message to its destination. Called for all level-specific methods by default.
     *
     * @param priority Log level. See [Log] for constants.
     * @param tag Explicit or inferred tag. May be `null`.
     * @param message Formatted log message. May be `null`, but then `t` will not be.
     * @param t Accompanying exceptions. May be `null`, but then `message` will not be.
     */
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {

    }
}