package sk.ygor.codility.lesson16

class TieRopes {

  def solution(k: Int, a: Array[Int]): Int = {
    var currentRope = 0
    var result = 0
    a.foreach(length => {
      currentRope += length
      if (currentRope >= k) {
        result += 1
        currentRope = 0
      }
    })
    result
  }

}
