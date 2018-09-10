package sk.ygor.codility.lesson03

import scala.collection.immutable.HashSet

class PermMissingElem {

  def solution(a: Array[Int]): Int = {
    val rangeXor = (1 to a.length + 1).foldLeft(0)((acc, i) => acc ^ i)
    val arrayXor = a.foldLeft(0)((acc, i) => acc ^ i)
    rangeXor ^ arrayXor
  }

  def solutionSlower(a: Array[Int]): Int = {
    val hashSet = HashSet() ++ a
    (1 to a.length + 1).find(i => !hashSet.contains(i)).get
  }

  def solutionSlowest(a: Array[Int]): Int = {
    a.sorted
      .view
      .zipWithIndex
      .find { case (item, index) => item != index + 1 }
      .collect { case (_, index) => index + 1 }
      .getOrElse(a.length + 1)
  }

}
