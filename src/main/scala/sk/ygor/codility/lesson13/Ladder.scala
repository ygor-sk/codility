package sk.ygor.codility.lesson13

class Ladder {

  def solution(a: Array[Int], b: Array[Int]): Array[Int] = {
    a.zip(b).map { case (ax, bx) => oneSolution(ax) % Math.pow(2, bx).toInt}
  }

  def oneSolution(a: Int): Int = {
    if (a >= 2) {
      oneSolution(a - 1) + oneSolution(a - 2) // looks like fibonaci
    } else if (a >= 1) {
      oneSolution(a - 1)
    } else {
      1
    }
  }

  def fib2( n : Int ) : Int = {
    var a = 0
    var b = 1
    var i = 0

    while( i < n ) {
      val c = a + b
      a = b
      b = c
      i = i + 1
    }
    a
  }

}

