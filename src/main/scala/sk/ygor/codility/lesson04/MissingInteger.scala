package sk.ygor.codility.lesson04

import scala.collection.mutable

class MissingInteger {

  /*
    It is guaranteed, that 1 <= result <= MAX_VALUE
   */
  final val MAX_VALUE = 100000

  def solution(a: Array[Int]): Int = {
    val seen = Array.ofDim[Boolean](MAX_VALUE)
    a.foreach(x => {
      if (x > 0 && x <= MAX_VALUE) {
        seen(x - 1) = true
      }
    })
    for (x <- 1 to MAX_VALUE) {
      if (!seen(x - 1)) {
        return x
      }
    }
    MAX_VALUE + 1
  }

  def solution2(a: Array[Int]): Int = {
    val seen = mutable.HashSet.empty[Int] ++ a.filter(x => x > 0 && x <= MAX_VALUE)
    for (x <- 1 to MAX_VALUE) {
      if (!seen.contains(x)) {
        return x
      }
    }
    MAX_VALUE + 1
  }
}