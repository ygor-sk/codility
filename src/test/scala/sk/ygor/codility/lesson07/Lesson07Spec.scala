package sk.ygor.codility.lesson07

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson07Spec extends FunSpec with TestUtils {

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
      ((1 to 1000000).toArray, Array.fill(1000000)(0), 1000000),
    )

    describe("solution") {
      examples foreach {
        case (sizes, directions, result) =>
          it(s"should calculate correct result for sizes: ${formatArray(sizes)} and directions ${formatArray(directions)}") {
            assert(solver.solution(sizes, directions) === result)
          }
      }
    }

  }

  describe("Brackets") {

    val solver = new Brackets

    val examples = Seq(
      ("", 1),
      ("(", 0),
      (")", 0),
      (")(", 0),
      ("((", 0),
      ("()()()()", 1),
      ("(())", 1),
      ("{{}}", 1),
      ("{{()}}", 1),
      ("{[()()]}", 1),
      ("([)()]", 0),
    )

    describe("solution") {
      examples foreach {
        case (string, result) =>
          it(s"should calculate correct result for sizes: ${formatString(string)}") {
            assert(solver.solution(string) === result)
          }
      }
    }

  }

  describe("StoneWall") {

    val solver = new StoneWall

    val examples = Seq(
      (Array(8, 8, 5, 7, 9, 8, 7, 4, 8), 7),
    )

    describe("solution") {
      examples foreach {
        case (string, result) =>
          it(s"should calculate correct result for sizes: ${formatArray(string)}") {
            assert(solver.solution(string) === result)
          }
      }
    }

  }

}
