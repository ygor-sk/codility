package sk.ygor.codility

import java.io.ByteArrayOutputStream

trait TestUtils {

  def formatArray(array: Array[_]): String = if (array.length > 100) s"[too long: ${array.length}]" else array.mkString("[", ", ", "]")

  def formatString(s: String): String = if (s.length > 100) s"[too long: ${s.length}]" else s

  def runSolution(function: => Unit, inputFile: String): String = {
    val inputStream = getInputStream(inputFile)
    val outputStream = new ByteArrayOutputStream()

    Console.withOut(outputStream) {
      Console.withIn(inputStream) {
        function
      }
    }

    inputStream.close()
    outputStream.flush()
    val result = outputStream.toString
    result.split("\n").foreach(line => println("### " + line))
    result
  }

  def readFile(inputFile: String): String = scala.io.Source.fromInputStream(getInputStream(inputFile)).mkString

  private def getInputStream(inputFile: String) = classOf[TestUtils].getClassLoader.getResourceAsStream(inputFile)

}
