package sk.ygor.codility.lesson07

import sk.ygor.codility.lesson07.Fish.Fisssh

import scala.collection.mutable

class Fish {

  def solution(a: Array[Int], b: Array[Int]): Int = {
    assert(a.length == b.length)

    val stack = mutable.ArrayStack[Fisssh]()

    def reduceStack(): Unit = {
      while (stack.size > 1) { // 2 or more fish
        val rightFish = stack.pop()
        val leftFish = stack.pop()
        if (leftFish.direction == 1 && rightFish.direction == 0) {
          val winner = if (leftFish.size > rightFish.size) leftFish else rightFish
          stack.push(winner)
        } else {
          stack.push(leftFish)
          stack.push(rightFish)
          return
        }
      }
    }

    a.zip(b).foreach {
      case (size, direction) =>
        stack.push(Fisssh(size, direction))
        reduceStack()
    }

    stack.size
  }

}

object Fish {

  case class Fisssh(size: Int, direction: Int)

}
