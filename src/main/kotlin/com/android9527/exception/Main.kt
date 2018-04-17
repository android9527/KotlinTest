package com.android9527.exception

import java.io.*

/**
 * Created by chenfeiyue on 2018/4/13.
 * Description: Exception
 * Kotlin中的try关键字就像 if 和 when 一样，引入了一个表达式
 */
fun main(args: Array<String>) {
    val result = try {
        test("10")
    } catch (e: Exception) {
        e.printStackTrace()
        -1
    } finally {
    }
    print(result)
}

@Throws(Exception::class)
internal fun test(string: String): Int {
    return string.toInt()
}

/**
 * kotlin不区分受检异常和未受检异常，不必指定函数抛出的异常，而且可以处理也可以不处理异常。
 */
fun write() {
    val file = File("test.txt")
    var outputStream: OutputStream? = null
    try {
        file.createNewFile()
        outputStream = FileOutputStream(file)
        val b = "Hello World".toByteArray(charset("UTF-8"))
        outputStream.write(b)
    } finally {
        if (outputStream != null) {
            outputStream.close()
        }
    }
}

fun writeFile() {
    val currentDir = System.getProperty("user.dir") + "\\out"
    val file = File(currentDir, "hehe.txt")
    file.writeText("hehe")
    println(file.readText())

    file.writeBytes(byteArrayOf(12, 56, 83, 57))
    println(file.readText())

    //追加方式写入字节或字符
    file.appendBytes(byteArrayOf(93, 85, 74, 93))
    file.appendText("hehe")
    println(file.readText())

    //直接使用writer和outputstream
    val writer: Writer = file.writer()
    val outputStream: OutputStream = file.outputStream()
    val printWriter: PrintWriter = file.printWriter()

}

