package sk.ygor.codility.lesson08

class Dominator {

  def solution(a: Array[Int]): Int = {
    val stack = new scala.collection.mutable.ArrayStack[Int]()
    a.foreach(item => {
      if (stack.isEmpty) {
        stack.push(item)
      } else {
        val top = stack.top
        if (top != item) {
          stack.pop()
        } else {
          stack.push(item)
        }
      }
    })
    if (stack.isEmpty) {
      -1
    } else {
      // o(n) again
      val leader = stack.top
      val leaderCount = a.count(item => item == leader)
      if (leaderCount  * 2 > a.length) {
        a.zipWithIndex.collectFirst {
          case (item, index) if item == leader => index
        }.get
      } else {
         - 1
      }
    }
  }

}
