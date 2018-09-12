package sk.ygor.codility.lesson07

class Nesting {

  def solution(s: String): Int = {
    var openBracketCount = 0
    s.foreach {
      case '(' =>
        openBracketCount += 1
      case ')' =>
        if (openBracketCount > 0) {
          openBracketCount -= 1
        } else {
          return 0
        }
    }
    if (openBracketCount == 0) 1 else 0
  }

  def solution2(s: String): Int = {
    val (openCountFinal, minimumFinal) = s.foldLeft((0, 0)) { (acc: (Int, Int), char: Char) => (char, acc) match {
      case ('(', (openCount, minimum)) => (openCount + 1, minimum)
      case (')', (openCount, minimum)) => (openCount - 1, Math.min(openCount - 1, minimum))
      case _ => throw new IllegalStateException
    }}
    if (openCountFinal == 0 && minimumFinal >= 0) 1 else 0
  }

}
