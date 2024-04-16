package sk.ygor.hackerrank.splitnumber

import scala.io.StdIn

object Solution {

  def main(args: Array[String]): Unit = {
    val scanner = new java.util.Scanner(Console.in)
    val count = Integer.parseInt(scanner.nextLine)
    (0 until count).foreach(_ => {
      val line = scanner.nextLine.trim()
      val parts = line.split("[ -]")
      println(
        s"CountryCode=${parts(0)},LocalAreaCode=${parts(1)},Number=${parts(2)}")
    })
  }
}
