package sk.ygor.codility

trait TestUtils {

  def formatArray(array: Array[_]): String = if (array.length > 100) "[too long]" else array.mkString("[", ", ", "]")

  def formatString(s: String): String = if (s.length > 100) "[too long]" else s
}
