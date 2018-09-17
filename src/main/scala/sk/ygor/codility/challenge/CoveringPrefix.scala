package sk.ygor.codility.challenge

import scala.collection.mutable

class CoveringPrefix {

  def solution(a: Array[Int]): Int = {
    val hashSet = mutable.HashSet[Int]() ++ a
    for (i <- a.indices) {
      hashSet -= a(i)
      if (hashSet.isEmpty) {
        return i
      }
    }
    throw new IllegalStateException()
  }

  def solution2(a: Array[Int]): Int = {
    val seen = Array.ofDim[Boolean](a.length)
    var result = 0
    for (i <- a.indices) {
      if (!seen(a(i))) {
        result = i
        seen(a(i)) = true
      }
    }
    result
  }

}
