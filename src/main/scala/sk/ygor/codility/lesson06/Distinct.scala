package sk.ygor.codility.lesson06

class Distinct {

  def solution(array: Array[Int]): Int = {
    array.length match {
      case 0 => 0
      case 1 => 1
      case _ =>
        val changeCount = array.sorted.sliding(2).count { case Array(a, b) => a < b }
        changeCount + 1
    }

  }


}
