package sk.ygor.codility.lesson03

import org.scalatest.FunSpec

class PermMissingElemSpec extends FunSpec {

  val permMissinElem = new PermMissingElem

  val examples = Seq(
    Array(1, 2, 3) -> 4,
    Array(1, 3, 2) -> 4,
    Array(1, 3, 4) -> 2,
    Array(2, 3, 4) -> 1,
    Array(2, 3, 1, 5) -> 4,
  )

  describe("PermMissingElem") {

    describe("solution") {
      examples foreach {
        case (array, result) => it(s"should calculate $result as missing in ${array.mkString(", ")}") {
          assert(permMissinElem.solution(array) === result)
        }
      }
    }

    describe("solution2") {
      examples foreach {
        case (array, result) => it(s"should calculate $result as missing in ${array.mkString(", ")}") {
          assert(permMissinElem.solution2(array) === result)
        }
      }
    }

    describe("solutionSlower") {
      examples foreach {
        case (array, result) => it(s"should calculate $result as missing in ${array.mkString(", ")}") {
          assert(permMissinElem.solutionSlower(array) === result)
        }
      }
    }

    describe("solutionSlowest") {
      examples foreach {
        case (array, result) => it(s"should calculate $result as missing in ${array.mkString(", ")}") {
          assert(permMissinElem.solutionSlowest(array) === result)
        }
      }
    }

  }

}
