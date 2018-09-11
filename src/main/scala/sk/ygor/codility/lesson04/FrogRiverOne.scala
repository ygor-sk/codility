package sk.ygor.codility.lesson04

import scala.collection.mutable

class FrogRiverOne {

  def solution(x: Int, a: Array[Int]): Int = {
    if (x == 0 || a.isEmpty) {
      -1
    } else {
      val leafs = Array.fill(x)(false)
      var remaining = x
      for (i <- a.indices) {
        if (!leafs(a(i) - 1)) {
          leafs(a(i) - 1) = true
          remaining -= 1
          if (remaining == 0) {
            return i
          }
        }
      }
      -1
    }
  }

  def solution2(x: Int, a: Array[Int]): Int = {
    if (x == 0 || a.isEmpty) {
      -1
    } else {
      val remaining = mutable.HashSet() ++ (1 to x)
      for (i <- a.indices) {
        remaining -= a(i)
        if (remaining.isEmpty) {
          return i
        }
      }
      -1
    }
  }

}
