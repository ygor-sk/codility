package sk.ygor.codility.lesson05

class PassingCars {

  def solution(a: Array[Int]): Int = {
    var result = 0
    var zeroes = 0
    a.foreach {
      case 0 => zeroes += 1
      case 1 => result += zeroes
    }
    if (result > 1000000000) -1 else result
  }

}
