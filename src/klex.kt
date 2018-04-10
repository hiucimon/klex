import org.hiucimon.klex.LoadOptions
import java.io.File
import java.nio.charset.Charset

fun main(args : Array<String>) {
    println("Hello, world!")
    LoadOptions("/Users/joe/klex/option")
    val binIn= File("/Users/joe/Dropbox/Characters/Twitchy-14t6.pcg")
    binIn.forEachLine(charset = Charset.forName("ISO-8859-1")) {
//        println(it)
    }
//    val b=binIn.readBytes()
//    val c=Regex(".*PCG(\\w+)")
//    val e=b.toString()
//    val d=c.matchEntire(e)
//    b.forEach {
//        println(it.toChar())
//    }
}
