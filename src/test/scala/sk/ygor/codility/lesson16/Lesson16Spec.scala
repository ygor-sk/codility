package sk.ygor.codility.lesson16

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson16Spec extends FunSpec with TestUtils {

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
