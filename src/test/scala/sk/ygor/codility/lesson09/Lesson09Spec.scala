package sk.ygor.codility.lesson09

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson09Spec extends FunSpec with TestUtils {

  describe("MaxSliceSum") {

    val solver = new MaxSliceSum

    val examples = Seq(
      Array(0) -> 0,
      Array(1) -> 1,
      Array(-1) -> -1,
      Array(-2) -> -2,
      Array(1, 2) -> 3,
      Array(-1, -2) -> -1,
      Array(-2, 1) -> 1,
      Array(-1, -2, 5) -> 5,
      Array(3, 2, -6, 4, 0) -> 5,
      Array(-1, -2, -3) -> -1,
      Array(-5, -4, -3, -2, -1) -> -1,
    )

    describe("solution") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array: ${formatArray(array)}") {
            assert(solver.solution(array) === result)
          }
      }
    }

  }

  describe("MaxProfit") {

    val solver = new MaxProfit

    val examples = Seq(
      Array.empty[Int] -> 0,
      Array(0) -> 0,
      Array(1) -> 0,
      Array(78546) -> 0,
      Array(1, 2, 3, 4) -> 3,
      Array(40, 24, 13, 5) -> 0,
      Array(23171, 21011, 21123, 21366, 21013, 21367) -> 356,
    )

    describe("solution") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array: ${formatArray(array)}") {
            assert(solver.solution(array) === result)
          }
      }
    }

    describe("solutionFaster") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array: ${formatArray(array)}") {
            assert(solver.solutionFaster(array) === result)
          }
      }
    }

  }

  describe("MaxDoubleSliceSum") {

    val solver = new MaxDoubleSliceSum

    val examples = Seq(
      Array(3, 2, 6, -1, 4, 5, -1, 2) -> 17,
      Array(1, 2, 3) -> 2,
      Array(2, 5, 10, 1, 21) -> (5 + 10 + 1),
      Array(2, -5, 10, 1, 21) -> (10 + 1),
      Array(5464565, -50, 10, -2, -5, 100, 999999) -> 110,
    )

    describe("solution") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array: ${formatArray(array)}") {
            assert(solver.solution(array) === result)
          }
      }
    }

  }

}
