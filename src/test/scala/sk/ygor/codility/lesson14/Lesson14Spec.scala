package sk.ygor.codility.lesson14

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson14Spec extends FunSpec with TestUtils {

  describe("MinMaxDivision") {

    val solver = new MinMaxDivision

    val examples = Seq(
      (1, 1, Array(0)) -> 0,
      (1, 100, Array(1, 6, 9)) -> 16,
      (2, 100, Array(1, 6, 9, 2)) -> 11,
      (3, 100, Array(2, 1, 5, 1, 2, 2, 2)) -> 6,
      (10000, 42, Array(42)) -> 42,
      (1, 100, Array(1)) -> 1,
      (1, 100, Array(1, 3, 2)) -> 6,
      (2, 100, Array(1, 3, 2)) -> 4,
      (3, 100, Array(1, 3, 2)) -> 3,
      (4, 100, Array(1, 3, 2)) -> 3,
    )

    describe("solution") {
      examples foreach {
        case ((k, m, array), result) =>
          it(s"should calculate correct result for k=$k, m=$m, array=${formatArray(array)}") {
            assert(solver.solution(k, m, array) === result)
          }
      }
    }

    describe("solution2") {
      examples foreach {
        case ((k, m, array), result) =>
          it(s"should calculate correct result for k=$k, m=$m, array=${formatArray(array)}") {
            assert(solver.solution2(k, m, array) === result)
          }
      }
    }

    describe("solution3") {
      examples foreach {
        case ((k, m, array), result) =>
          it(s"should calculate correct result for k=$k, m=$m, array=${formatArray(array)}") {
            assert(solver.solution2(k, m, array) === result)
          }
      }
    }

  }

  describe("NailingPlanks") {

    val examples = Seq(
//      (Array(1), Array(1), Array(1)) -> 1,
//      (Array(1), Array(1), Array(0)) -> -1,
//      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(1, 1, 1, 1, 1, 1, 1)) -> 1,
//      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(1)) -> 1,
//      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(2)) -> -1,
//      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(3)) -> -1,
//      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(4)) -> -1,
//      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(5)) -> -1,
//      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(1, 2, 3, 4)) -> 1,
      (Array(1, 1, 1, 1), Array(1, 2, 3, 4), Array(4, 3, 2, 1)) -> 4,
//      (Array(1, 4, 5, 8), Array(4, 5, 9, 10), Array(4, 6, 7, 10, 2)) -> 4,
//      (Array.fill(100000)(10), Array.fill(100000)(10), Array(1)) -> -1,
//      (Array.fill(200000)(10), Array.fill(200000)(10), Array(11)) -> -1,
//      (Array.fill(200000)(10), Array.fill(200000)(10), (1 to 200000).toArray) -> 10,
//      (Array.fill(100000)(100000), Array.fill(100000)(100000), (1 to 100000).toArray) -> 100000,
    )

    describe("Scala") {

      val solver = new NailingPlanks

      describe("solution") {
        examples foreach {
          case ((a, b, c), result) =>
            it(s"should calculate correct result for a=${formatArray(a)}, b=${formatArray(b)}, c=${formatArray(c)}") {
              assert(solver.solution(a, b, c) === result)
            }
        }
      }

      describe("solution2") {
        examples foreach {
          case ((a, b, c), result) =>
            it(s"should calculate correct result for a=${formatArray(a)}, b=${formatArray(b)}, c=${formatArray(c)}") {
              assert(solver.solution2(a, b, c) === result)
            }
        }
      }
      describe("solution3") {
        examples foreach {
          case ((a, b, c), result) =>
            it(s"should calculate correct result for a=${formatArray(a)}, b=${formatArray(b)}, c=${formatArray(c)}") {
              assert(solver.solution3(a, b, c) === result)
            }
        }
      }

    }

    describe("Java") {

      val solver = new NailingPlanksJava

      describe("solution") {
        examples foreach {
          case ((a, b, c), result) =>
            it(s"should calculate correct result for a=${formatArray(a)}, b=${formatArray(b)}, c=${formatArray(c)}") {
              assert(solver.solution(a, b, c) === result)
            }
        }
      }

    }


  }

}
