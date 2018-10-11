package sk.ygor.codility.lesson07

import scala.collection.mutable

class StoneWall {

  def solution(a: Array[Int]): Int = {
    val queue = new mutable.ArrayStack[Int]
    var result = 0
    for (i <- a.indices) {
      val nextBlock = a(i)
      while (queue.nonEmpty && nextBlock < queue.top) {
        queue.pop()
        result += 1
      }
      if (queue.isEmpty || nextBlock > queue.top) {
        queue.push(nextBlock)
      }
    }
    result + queue.size
  }


}
