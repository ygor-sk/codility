package sk.ygor.codility.lesson10

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class Lesson10Spec extends FunSpec with TestUtils {

  describe("CountFactors") {

    val solver = new CountFactors

    val examples = Seq(
      1 -> 1,
      2 -> 2,
      3 -> 2,
      4 -> 3,
      5 -> 2,
      6 -> 4,
      24 -> 8,
    )

    describe("solution") {
      examples foreach {
        case (number, result) =>
          it(s"should calculate correct result for number $number") {
            assert(solver.solution(number) === result)
          }
      }
    }

  }

  describe("MinPerimeterRectangle") {

    val solver = new MinPerimeterRectangle

    val examples = Seq(
      1 -> 4,
      2 -> 6,
      30 -> 22,
    )

    describe("solution") {
      examples foreach {
        case (number, result) =>
          it(s"should calculate correct result for number $number") {
            assert(solver.solution(number) === result)
          }
      }
    }

  }

}
