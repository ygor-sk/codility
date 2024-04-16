package sk.ygor.hackerrank.language

import java.util.Scanner

object Solution {

  val languages: Array[String] = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA: ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC"
    .split(":").map(_.trim)


  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(Console.in)
    val lineCount = scanner.nextInt
    (0 until lineCount)
      .foreach(_ => {
        scanner.nextInt
        val language = scanner.next()
        println(if (languages.contains(language)) "VALID" else "INVALID")
      })
  }

}
