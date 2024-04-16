package sk.ygor.hackerrank.smartide

import java.util.Scanner
import java.util.regex.Pattern

object Solution {


  val patterns = Map(
    ("Java", List("import.+;", "public .+\\{")),
    ("C", List("#include<.+>")),
    ("Python", List(".*print ", "def .+:")),
  )

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(Console.in)
    while (scanner.hasNext) {
      val line = scanner.nextLine()

      patterns.foreach { case (lang, patterns) => {
        patterns.foreach(pattern => {
          if (Pattern.compile(pattern).matcher(line).find()) {
            println(lang);
            return;
          }
        })
      }
      }

    }
    println("Unknown")
  }

}
