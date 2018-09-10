package sk.ygor.codility.lesson02

import org.scalatest.FunSpec

class CyclicRotationSpec extends FunSpec {

  val cyclicRotation = new CyclicRotation

  val examples = Seq(
    (Array(3, 8, 9, 7, 6), 3) -> Array(9, 7, 6, 3, 8),
    (Array(3, 8, 9, 7, 6), 0) -> Array(3, 8, 9, 7, 6),
    (Array(0, 0, 0), 1) -> Array(0, 0, 0),
    (Array(1, 2, 3, 4), 4) -> Array(1, 2, 3, 4),
    (Array(1, 2, 3, 4), 2) -> Array(3, 4, 1, 2),
    (Array(1, 2, 3, 4), 18) -> Array(3, 4, 1, 2),
    (Array(1), 0) -> Array(1),
    (Array(1), 18) -> Array(1),
    (Array[Int](), 18) -> Array(),
  )

  describe("CyclicRotation solution") {
    examples foreach {
      case ((array, k), result) => it(s"should rotate array ${array.mkString(", ")} $k-times to array ${result.mkString(", ")}") {
        assert(cyclicRotation.solution(array, k) === result)
      }
    }
  }

}
