package sk.ygor.codility.lesson06

import org.scalatest.FunSpec

class Lesson06Spec extends FunSpec {

  describe("Distinct") {

    val solver = new Distinct

    val examples = Seq(
      Array.empty[Int] -> 0,
      Array(45645) -> 1,
      Array(2, 1, 1, 2, 3, 1) -> 3,
      Array(2, 1, 1, 2, 345612, 1) -> 3,
      Array.fill(1000)(3425) ++ Array.fill(1000)(546) -> 2,
    )

    examples foreach {
      case (array, result) =>
        it(s"should calculate correct result for array: ${if (array.length > 100) "[too long]" else array.mkString(", ")}") {
          assert(solver.solution(array) === result)
        }
    }
  }


}
