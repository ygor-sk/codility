package sk.ygor.codility.lesson02

import org.scalatest.{FunSpec, Matchers}

class OddOccurrencesInArraySpec extends FunSpec with Matchers {

  val examples = Seq(
    Array[Int]() -> Left("no result"),
    Array(1) -> Right(1),
    Array(1, 2) -> Left("multiple results: 1, 2"),
    Array(1, 2, 2) -> Right(1),
    Array(2, 1, 2) -> Right(1),
    Array(2, 2, 1) -> Right(1),
    Array(1, 2, 1, 2, 3, 4) -> Left("multiple results: 3, 4"),
    Array(1, 2, 3, 1, 2, 3, 3, 4) -> Left("multiple results: 3, 4"),
  )

  describe("Scala") {

    val occurrencesInArray = new OddOccurrencesInArray

    describe("OddOccurrencesInArray solution") {
      examples foreach {
        case (array, Left(message)) =>
          it(s"should throw RuntimeException with message: $message for array ${array.mkString(", ")}") {
            val exception = the[RuntimeException] thrownBy {
              occurrencesInArray.solution(array)
            }
            assert(exception.getMessage === message)
          }
        case (array, Right(result)) =>
          it(s"should calculate result $result for array ${array.mkString(", ")}") {
            assert(occurrencesInArray.solution(array) === result)
          }

      }
    }
  }

  describe("Java") {

    val occurrencesInArray = new OddOccurrencesInArrayJava

    describe("OddOccurrencesInArrayJava solution") {
      examples collect  {
        case (array, Right(result)) =>
          it(s"should calculate result $result for array ${array.mkString(", ")}") {
            assert(occurrencesInArray.solution(array) === result)
          }

      }
    }
  }

}