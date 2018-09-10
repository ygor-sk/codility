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

}
