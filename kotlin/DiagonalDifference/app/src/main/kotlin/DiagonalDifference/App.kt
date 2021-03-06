/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package DiagonalDifference

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.math.*


class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val n: Int = arr.size
    // left to right diag
    var sum1: Int = 0
    for(i in 0..n-1) {
        sum1 += arr[i][i]
    }
    // right to left diag
    var sum2: Int = 0
    for(i in 0..n-1) {
        sum2 += arr[i][n-1-i]
    }
    return Math.abs(sum1 - sum2)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
