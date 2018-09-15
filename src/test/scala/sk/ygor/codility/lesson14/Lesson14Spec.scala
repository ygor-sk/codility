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
      (1, 100, Array(1,3,2)) -> 6,
      (2, 100, Array(1,3,2)) -> 4,
      (3, 100, Array(1,3,2)) -> 3,
      (4, 100, Array(1,3,2)) -> 3,
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

  }

}
