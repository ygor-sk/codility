package sk.ygor.codility.lesson3

class FrogJmp {
  def solution(x: Int, y: Int, d: Int): Int = {
    val distance = y - x
    val hopCount = distance / d
    val lastHop = distance % d
    if (lastHop == 0) {
      hopCount
    } else {
      hopCount + 1
    }
  }
}
