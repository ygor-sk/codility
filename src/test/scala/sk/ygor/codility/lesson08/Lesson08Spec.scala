package sk.ygor.codility.lesson08

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson08Spec extends FunSpec with TestUtils {

  describe("EquiLeader") {

    val solver = new EquiLeader

    val examples = Seq(
      Array(1) -> 0,
      Array(4, 3, 4, 4, 4, 2) -> 2,
      Array(3, 3, 3, 3, 3, 3, 3, 3) -> 7,
      Array.fill(100000)(42) -> (100000 - 1),
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

  describe("Dominator") {

    val solver = new Dominator

    val examples = Seq(
      Array(1) -> 0,
      Array(1, 2) -> -1,
      Array(2, 2) -> 0,
      Array(1, 2, 2) -> 1,
      Array(1, 2, 3, 4, 5, 3, 3, 3, 3) -> 2,
      Array(3, 4, 3, 2, 3, -1, 3, 3) -> 0,
      Array(1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2) -> 5,
      Array(1, 2, 3, 4, 5) -> -1,
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
