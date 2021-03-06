package sk.ygor.codility.lesson05

import org.scalatest.FunSpec

class Lesson05Spec extends FunSpec {

  describe("PassingCars") {

    val solver = new PassingCars

    val examples = Seq(
      Array(0, 1, 0, 1, 1) -> 5,
      Array.fill(100000)(0) ++ Array.fill(100000)(1) -> -1,
    )

    examples foreach {
      case (array, result) =>
        it(s"should calculate correct result for array: ${if (array.length > 100) "[too long]" else array.mkString(", ")}") {
          assert(solver.solution(array) === result)
        }
    }
  }

  describe("CountDiv") {

    val solver = new CountDiv

    val examples = Seq(
      (6, 11, 2) -> 3,
      (1, 15, 5) -> 3,
      (1, 6789, 1) -> 6789,
      (10, 20, 100) -> 0,
      (3, 4, 5) -> 0,
      (3, 9, 5) -> 1,
    )

    examples foreach {
      case ((a, b, k), result) =>
        it(s"should calculate correct result for a=$a, b=$b, k=$k") {
          assert(solver.solution(a, b, k) === result)
        }
    }
  }
  describe("GenomicRangeQuery") {

    val solver = new GenomicRangeQuery

    val examples = Seq(
      ("CAGCCTA", Array(2, 5, 0), Array(4, 5, 6)) -> Array(2, 4, 1),
    )

    examples foreach {
      case ((s, p, q), result) =>
        it(s"should calculate correct result for s=$s, p=$p, q=$q") {
          assert(solver.solution(s, p, q) === result)
        }
    }
  }

  describe("MinAvgTwoSlice") {

    val solver = new MinAvgTwoSlice

    val examples = Seq(
      Array(4, 2, 2, 5, 1, 5, 8) -> 1,
    )

    describe("solution O(n^2)") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${array.mkString(", ")}") {
            assert(solver.solution(array) === result)
          }
      }
    }

    describe("solution O(n)") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${array.mkString(", ")}") {
            assert(solver.solution2(array) === result)
          }
      }
    }

    describe("solution3 O(n)") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array=${array.mkString(", ")}") {
            assert(solver.solution3(array) === result)
          }
      }
    }

  }


}
