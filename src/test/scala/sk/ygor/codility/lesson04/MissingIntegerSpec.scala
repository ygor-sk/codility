package sk.ygor.codility.lesson04

import org.scalatest.FunSpec

class MissingIntegerSpec extends FunSpec {

  val missingInteger = new MissingInteger

  val examples = Seq(
    Array(1, 3, 6, 4, 1, 2) -> 5,
    Array(1, 2, 3) -> 4,
    Array(-1, -3) -> 1,
    Array[Int]() -> 1,
  )

  describe("MissingInteger") {
    examples foreach {
      case (array, result) => it(s"should calculate $result as missing integer in array ${array.mkString(", ")}") {
        assert(missingInteger.solution(array) === result)
      }
    }
  }

  describe("MissingInteger solution 2") {
    examples foreach {
      case (array, result) => it(s"should calculate $result as missing integer in array ${array.mkString(", ")}") {
        assert(missingInteger.solution2(array) === result)
      }
    }
  }

}