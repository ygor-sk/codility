package sk.ygor.codility

class Lesson1 {

  def solution(n: Int): Int = {
    var max: Int = 0
    var gap: Int = 0
    var lastWasOne: Boolean = false
    val binaryString = n.toBinaryString
    println(binaryString)
    binaryString.foreach {
      case '0' =>
        if (lastWasOne) {
          gap = 1
        } else {
          if (gap > 0) {
            gap += 1
          }
        }
        lastWasOne = false
      case '1' =>
        if (gap > 0) {
          assert(!lastWasOne)
          max = Math.max(gap, max)
          gap = 0
        }
        lastWasOne = true
    }
    max
  }

  def solution2(n: Int): Int = {
    val solutions = n.toBinaryString
      .zipWithIndex
      .collect {
        case ('1', position) => position
      }
      .sliding(2)
      .map {
        case Seq(_) => 0
        case Seq(start, end) => end - start - 1
      }
    if (solutions.nonEmpty)
      solutions.max
    else
      0
  }

}
