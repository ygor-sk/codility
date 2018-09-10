package sk.ygor.codility.lesson03

class TapeEquilibrium {

  def solution(a: Array[Int]): Int = {
    val sum = a.sum
    var min = sum
    var leftSum = 0
    var rightSum = sum
    a.foreach(element => {
      leftSum += element
      rightSum -= element
      min = Math.min(min, Math.abs(leftSum - rightSum))
    })
    min
  }

}
