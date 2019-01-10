package sk.ygor.codility.lesson13

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson13Spec extends FunSpec with TestUtils {

  describe("Ladder") {

    val solver = new Ladder

    val examples = Seq(
      (Array(4, 4, 5, 5, 1), Array(3, 2, 4, 3, 1)) -> Array(5, 1, 8, 0, 1),
    )

    describe("solution") {
      examples foreach {
        case ((a, b), result) =>
          it(s"should calculate correct result for a = ${formatArray(a)} and b = ${formatArray(b)}") {
            assert(solver.solution(a, b) === result)
          }
      }
    }

  }

}
