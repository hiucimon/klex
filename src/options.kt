
package org.hiucimon.klex

import java.io.File

val GlobalOptions= hashMapOf<String,String>()

fun LoadOptions(fn:String) {
    val fh= File(fn)
    fh.forEachLine {
        println(it)
    }
}