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

}
