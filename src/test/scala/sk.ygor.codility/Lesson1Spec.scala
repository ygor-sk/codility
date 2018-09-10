package sk.ygor.codility

import org.scalatest.FunSpec

class Lesson1Spec extends FunSpec {

  val lesson1 = new Lesson1

  val examples = Map(
    0 -> 0,
    1 -> 0,
    2 -> 0,
    3 -> 0,
    5 -> 1,
    9 -> 2,
    529 -> 4,
    20 -> 1,
    15 -> 0,
  )

  describe("Lession 1 solution") {
    examples foreach {
      case (number, result) => it(s"should calculate, that number $number has longest binary gap of size $result") {
        assert(lesson1.solution(number) === result)
      }
    }
  }

  describe("Lession 1 solution2") {
    examples foreach {
      case (number, result) => it(s"should calculate, that number $number has longest binary gap of size $result") {
        assert(lesson1.solution2(number) === result)
      }
    }
  }

}
