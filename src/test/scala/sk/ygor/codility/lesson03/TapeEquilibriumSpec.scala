package sk.ygor.codility.lesson03

import org.scalatest.FunSpec

class TapeEquilibriumSpec extends FunSpec {

  val tapeEquilibrium = new TapeEquilibrium

  val examples = Seq(
    Array(3, 1, 2, 4, 3) -> 1,
    Array(1, 15) -> 14,
    Array(1, 19, 15) -> 5,
  )

  describe("TapeEquilibrium") {
    examples foreach {
      case (array, result) => it(s"should calculate $result as equilibrium of tape ${array.mkString(", ")}") {
        assert(tapeEquilibrium.solution(array) === result)
      }
    }
  }

}
