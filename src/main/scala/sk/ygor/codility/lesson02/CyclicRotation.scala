package sk.ygor.codility.lesson02

class CyclicRotation {

  def solution(a: Array[Int], k: Int): Array[Int] = {
    if (a.isEmpty) {
      a
    } else {
      val kmod = a.length - (k % a.length)
      a.slice(kmod, a.length) ++ a.slice(0, kmod)
    }
  }

  def solution2(a: Array[Int], k: Int): Array[Int] = {
    val result = Array.ofDim[Int](a.length)
    for (i <- a.indices) {
      result((i + k) % a.length) = a(i)
    }
    result
  }

}
