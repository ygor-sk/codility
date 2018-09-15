package sk.ygor.codility.lesson12

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson12Spec extends FunSpec with TestUtils {

  describe("ChocolatesByNumbers") {

    val solver = new ChocolatesByNumbers

    val examples = Seq(
      (1, 1) -> 1,
      (2, 1) -> 2,
      (70, 4) -> 35,
      (10, 4) -> 5,
      (1, 2) -> 1,
      (4, 6) -> 2,
    )

    describe("solution") {
      examples foreach {
        case ((number, step), result) =>
          it(s"should calculate correct result for number $number and step $step") {
            assert(solver.solution(number, step) === result)
          }
      }
    }

  }

}
