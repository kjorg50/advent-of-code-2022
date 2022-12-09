// Advent of Code
// Day 01
// https://adventofcode.com/2022/day/1

import java.io.File

fun part1(filename: String) {
    val elfCalories = arrayListOf<Int>()

    var calCount = 0
    File(filename).forEachLine {
        if (it == "") {
            elfCalories.add(calCount)
            calCount = 0
        } else {
            calCount += it.toInt()
        }
    }

    val max: Int = elfCalories.maxOrNull() ?: 0
    println(max)
}

// Same as part 1 but get the sum of the top 3
fun part2(filename: String) {
    val elfCalories = arrayListOf<Int>()

    var calCount = 0
    File(filename).forEachLine {
        if (it == "") {
            elfCalories.add(calCount)
            calCount = 0
        } else {
            calCount += it.toInt()
        }
    }

    val arrayElves: Array<Int> = elfCalories.toTypedArray()
    arrayElves.sortDescending()
    val sum = arrayElves[0] + arrayElves[1] + arrayElves[2]
    println(sum)
}

fun main() {
//    part1("input")
    part2("input")
}
