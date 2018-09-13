package sk.ygor.codility.lesson08

class EquiLeader {

  def solution(a: Array[Int]): Int = {
    leader(a) match {
      case None =>
        0
      case Some((leaderValue, leaderCount)) =>
        var leaderCounter = 0
        var result = 0
        for (i <- 0 until a.length - 1) {
          if (a(i) == leaderValue) {
            leaderCounter +=1
          }

          def isLeader(leaderCount: Int, totalCount: Int) = leaderCount * 2 > totalCount

          if (isLeader(leaderCounter, i + 1) && isLeader(leaderCount - leaderCounter, a.length - i - 1) ) {
            result +=1
          }
        }
        result

    }
  }

  def leader(a: Array[Int]): Option[(Int, Int)] = {
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
      None
    } else {
      // o(n) again
      val leader = stack.top
      val leaderCount = a.count(item => item == leader)
      if (leaderCount  * 2 > a.length) {
        Some((leader, leaderCount))
      } else {
        None
      }
    }
  }


}
