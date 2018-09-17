package sk.ygor.codility.challenge

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class ChallengeSpec extends FunSpec with TestUtils {

  describe("CoveringPrefix") {

    val solver = new CoveringPrefix

    val examples = Seq(
      Array(0) -> 0,
      Array(1, 1, 1) -> 0,
      Array(1, 1, 2) -> 2,
      Array(2, 2, 1, 0, 1) -> 3,
      Array(2, 2, 1, 0, 1, 4) -> 5,
      (0 until 100000).toArray -> (100000 - 1),
      Array.fill(100000)(5) ++ Array(7) -> 100000
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

  }

}
