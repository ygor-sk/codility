package sk.ygor.codility.lesson07

import org.scalatest.FunSpec

class Lesson07Spec extends FunSpec {

  describe("Nesting") {

    val solver = new Nesting

    val examples = Seq(
      "" -> 1,
      "()" -> 1,
      "(" -> 0,
      ")" -> 0,
    )

    describe("solution") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array: ${if (array.length > 100) "[too long]" else array.mkString(", ")}") {
            assert(solver.solution(array) === result)
          }
      }
    }

    describe("solution2") {
      examples foreach {
        case (array, result) =>
          it(s"should calculate correct result for array: ${if (array.length > 100) "[too long]" else array.mkString(", ")}") {
            assert(solver.solution2(array) === result)
          }
      }
    }
  }

  describe("Fish") {

    val solver = new Fish

    val examples = Seq(
      (Array.empty[Int], Array.empty[Int], 0),
      (Array(42), Array(0), 1),
      (Array(42), Array(1), 1),
      (Array(1, 2), Array(0, 1), 2),
      (Array(1, 2), Array(1, 0), 1),
      (Array(1, 2, 3, 4, 5), Array(1, 1, 1, 1, 0), 1),
      (Array(1, 2, 3, 4, 5), Array(1, 1, 1, 1, 1), 5),
      (Array(4, 3, 2, 1, 5), Array(0, 1, 0, 0, 0), 2),
    )

    describe("solution") {
      examples foreach {
        case (sizes, directions, result) =>
          it(s"should calculate correct result for sizes: ${sizes.mkString(", ")} and directions ${directions.mkString(", ")}") {
            assert(solver.solution(sizes, directions) === result)
          }
      }
    }

  }

}
