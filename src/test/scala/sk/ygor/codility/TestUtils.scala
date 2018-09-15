package sk.ygor.codility

trait TestUtils {

  def formatArray(array: Array[_]): String = if (array.length > 100) s"[too long: ${array.length}]" else array.mkString("[", ", ", "]")

  def formatString(s: String): String = if (s.length > 100) s"[too long: ${s.length}]" else s
}
