package sk.ygor.codility.lesson15

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson15Spec extends FunSpec with TestUtils {

  describe("AbsDistinct") {

    val solver = new AbsDistinct

    val examples = Seq(
      Array(10) -> 1,
      Array(-10) -> 1,
      Array(-10, 10) -> 1,
      Array(-10, 11) -> 2,
      Array(1, 6, 9, 17) -> 4,
      Array(1, 9, 9, 17) -> 3,
      Array(-5, -3, -2) -> 3,
      Array(-5, -3, -3, -2) -> 3,
      Array(-5, -5, -3, -3, -2) -> 3,
      Array(-5, -5, -3, -3, -2, -2) -> 3,
      Array(-5, -5, -3, -3, -2, -2, 5) -> 3,
      Array(-5, -5, -3, -3, -2, -2, 5, 5, 7) -> 4,
    )

    describe("solution") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${formatArray(array)}") {
            assert(array.sorted sameElements array)
            assert(solver.solution(array) === result)
          }
      }
    }
  }

  describe("CountDistinctSlices") {

    val solver = new CountDistinctSlices

    val examples = Seq(
      Array(1) -> 1,
      Array(1, 2) -> 3,
      Array(1, 2, 3) -> 6,
      Array(1, 2, 3, 3) -> 7,
      Array(3, 4, 5, 5, 2) -> 9,
    )

    describe("solution") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${formatArray(array)}") {
            assert(solver.solution(0, array) === result)
          }
      }
    }

    describe("solution2") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${formatArray(array)}") {
            assert(solver.solution2(0, array) === result)
          }
      }
    }
  }

  describe("CountTriangles") {

    val solver = new CountTriangles

    val examples = Seq(
      Array.empty[Int] -> 0,
      Array(5) -> 0,
      Array(5, 6) -> 0,
      Array(5, 6, 7) -> 1,
      Array(1, 1, 1) -> 1,
      Array(1, 2, 3) -> 0,
      Array(10, 2, 5, 1, 8, 12) -> 4,
    )

    describe("solution") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${formatArray(array)}") {
            assert(solver.solution(array) === result)
          }
      }
    }

    describe("solution2") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${formatArray(array)}") {
            assert(solver.solution2(array) === result)
          }
      }
    }

    describe("solution3") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${formatArray(array)}") {
            assert(solver.solution3(array) === result)
          }
      }
    }


  }

  describe("MaxNonoverlappingSegments") {

    val solver = new MaxNonoverlappingSegments

    val examples = Seq(
      (Array.empty[Int], Array.empty[Int]) -> 0,
      (Array(42), Array(42)) -> 1,
      (Array(42), Array(43)) -> 1,
      (Array(1, 2), Array(2, 3)) -> 1,
      (Array(1, 3), Array(2, 4)) -> 2,
      (Array(1, 1, 1, 1, 1), Array(1, 2, 3, 4, 5)) -> 1,
      (Array(1, 3, 7, 9, 9), Array(5, 6, 8, 9, 10)) -> 3,
    )

    describe("solution") {
      examples foreach {
        case ((a, b), result) =>
          it(s"should calculate correct result for a=${formatArray(a)}, b=${formatArray(b)}") {
            assert(solver.solution(a, b) === result)
          }
      }
    }

  }


}
