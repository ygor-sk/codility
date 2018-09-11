package sk.ygor.codility.lesson04

import org.scalatest.FunSpec

class Lesson04Spec extends FunSpec {

  describe("MaxCounters") {

    val solver = new MaxCounters

    val examples = Seq(
      (Array(3, 4, 4, 6, 1, 4, 4), 5) -> Array(3, 2, 2, 4, 2),
      (Array(1, 2, 10, 3, 2, 10, 2, 2, 3), 3) -> Array(2, 4, 3),
    )

    examples foreach {
      case ((instructions, counterCount), result) =>
        it(s"should calculate ${result.mkString(", ")} for $counterCount counters and instructions ${instructions.mkString(", ")}") {
          assert(solver.solution(instructions, counterCount) === result)
        }
    }
  }


  describe("MissingInteger") {

    val missingInteger = new MissingInteger

    val examples = Seq(
      Array(1, 3, 6, 4, 1, 2) -> 5,
      Array(1, 2, 3) -> 4,
      Array(-1, -3) -> 1,
      Array[Int]() -> 1,
      Array(0) -> 1,
      Array(1) -> 2,
      Array(2) -> 1,
      Array(3) -> 1,
    )

    describe("solution") {
      examples foreach {
        case (array, result) => it(s"should calculate $result as missing integer in array ${array.mkString(", ")}") {
          assert(missingInteger.solution(array) === result)
        }
      }
    }

    describe("solution 2") {
      examples foreach {
        case (array, result) => it(s"should calculate $result as missing integer in array ${array.mkString(", ")}") {
          assert(missingInteger.solution2(array) === result)
        }
      }
    }

    describe("solution 3 slowest") {
      examples foreach {
        case (array, result) => it(s"should calculate $result as missing integer in array ${array.mkString(", ")}") {
          assert(missingInteger.solution3Slowest(array) === result)
        }
      }
    }

  }

  describe("FrogRiverOne") {

    val solver = new FrogRiverOne

    val examples = Seq(
      (5, Array[Int]()) -> -1,
      (1, Array(1)) -> 0,
      (2, Array(1)) -> -1,
      (2, Array(2)) -> -1,
      (2, Array(1, 2)) -> 1,
      (2, Array(1, 2, 1)) -> 1,
      (2, Array(1, 1, 2)) -> 2,
      (5, Array(1, 3, 1, 4, 2, 3, 5, 4)) -> 6,
    )

    describe("solution") {
      examples foreach {
        case ((x, array), result) => it(s"should calculate correct result for x=$x, array=${array.mkString(", ")}") {
          assert(solver.solution(x, array) === result)
        }
      }
    }

    describe("solution2") {
      examples foreach {
        case ((x, array), result) => it(s"should calculate correct result for x=$x, array=${array.mkString(", ")}") {
          assert(solver.solution2(x, array) === result)
        }
      }
    }

  }


}
