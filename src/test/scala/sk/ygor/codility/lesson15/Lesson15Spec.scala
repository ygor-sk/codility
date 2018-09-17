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
          assert(array.sorted sameElements array)
          it(s"should calculate correct result for array=${formatArray(array)}") {
            assert(solver.solution(array) === result)
          }
      }
    }
  }


}
