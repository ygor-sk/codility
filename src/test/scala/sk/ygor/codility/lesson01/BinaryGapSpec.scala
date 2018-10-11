package sk.ygor.codility.lesson01

import org.scalatest.FunSpec

class BinaryGapSpec extends FunSpec {

  val examples = Map(
    0 -> 0,
    1 -> 0,
    2 -> 0,
    3 -> 0,
    5 -> 1,
    9 -> 2,
    529 -> 4,
    20 -> 1,
    15 -> 0,
  )

  describe("Scala") {

    val binaryGap = new BinaryGap

    describe("BinaryGap solution") {
      examples foreach {
        case (number, result) => it(s"should calculate, that number $number has longest binary gap of size $result") {
          assert(binaryGap.solution(number) === result)
        }
      }
    }

    describe("BinaryGap solution2") {
      examples foreach {
        case (number, result) => it(s"should calculate, that number $number has longest binary gap of size $result") {
          assert(binaryGap.solution2(number) === result)
        }
      }
    }

    describe("BinaryGap solution3") {
      examples foreach {
        case (number, result) => it(s"should calculate, that number $number has longest binary gap of size $result") {
          assert(binaryGap.solution3(number) === result)
        }
      }
    }

  }

  describe("Java") {
    val binaryGap = new BinaryGapJava

    describe("BinaryGap solution") {
      examples foreach {
        case (number, result) => it(s"should calculate, that number $number has longest binary gap of size $result") {
          assert(binaryGap.solution(number) === result)
        }
      }
    }
  }

}
