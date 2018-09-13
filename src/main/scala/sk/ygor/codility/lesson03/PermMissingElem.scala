package sk.ygor.codility.lesson03

import scala.collection.immutable.HashSet

class PermMissingElem {

  def solution(a: Array[Int]): Int = {
    val rangeXor = (1 to a.length + 1).foldLeft(0)((acc, i) => acc ^ i)
    val arrayXor = a.foldLeft(0)((acc, i) => acc ^ i)
    rangeXor ^ arrayXor
  }

  def solution2(a: Array[Int]): Int = {
    val missing = Array.fill(a.length + 1)(true)
    a.foreach(item => missing(item - 1) = false)
    for (i <- missing.indices) {
      if (missing(i)) {
        return i+1
      }
    }
    sys.error("invalid input array")
  }

  def solutionSlower(a: Array[Int]): Int = {
    val hashSet = HashSet() ++ a
    (1 to a.length + 1).find(i => !hashSet.contains(i)).get
  }

  def solutionSlowest(a: Array[Int]): Int = {
    a.sorted
      .zipWithIndex
      .collectFirst { case (item, index) if item != index + 1 => index + 1 }
      .getOrElse(a.length + 1)
  }

}
