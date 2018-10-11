package sk.ygor.codility.lesson04

class PermCheck {

  def solution(a: Array[Int]): Int = {
    assert(a.nonEmpty)
    val flags = Array.fill(a.length)(false)
    var remaining = a.length
    for (i <- a.indices) {
      val idx = a(i) - 1
      if (idx >= 0 && idx < flags.length && !flags(idx)) {
        flags(idx) = true
        remaining -= 1
        if (remaining == 0) {
          return 1
        }
      }
    }
    0
  }

  def solution2(a: Array[Int]): Int = {
    val seen = Array.fill(a.length)(false)
    var remaining = a.length
    for (i <- a.indices) {
      val number = a(i) - 1
      if (number < 0 || number >= seen.length || seen(number)) {
        return 0
      } else {
        seen(number) = true
        remaining -= 1
      }
    }
    if (remaining == 0) {
      1
    } else {
      0
    }

  }


}
