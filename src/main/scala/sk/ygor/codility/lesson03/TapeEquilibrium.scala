package sk.ygor.codility.lesson03

class TapeEquilibrium {

  def solution(a: Array[Int]): Int = {
    val sum = a.sum
    var leftSum = a.head
    var rightSum = sum - a.head
    var min = Math.abs(leftSum - rightSum)
    for (i <- 1 until a.length - 1) {
      val element = a(i)
      leftSum += element
      rightSum -= element
      min = Math.min(min, Math.abs(leftSum - rightSum))
    }
    min
  }

}
