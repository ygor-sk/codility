package sk.ygor.codility.lesson04

import org.scalatest.FunSpec

class MaxCountersSpec extends FunSpec {

  val solver = new MaxCounters

  val examples = Seq(
    (Array(3, 4, 4, 6, 1, 4, 4), 5) -> Array(3, 2, 2, 4, 2),
    (Array(1, 2, 10, 3, 2, 10, 2, 2, 3), 3) -> Array(2, 4, 3),
  )

  describe("MaxCounters") {
    examples foreach {
      case ((instructions, counterCount), result) =>
        it(s"should calculate ${result.mkString(", ")} for $counterCount counters and instructions ${instructions.mkString(", ")}") {
          assert(solver.solution(instructions, counterCount) === result)
        }
    }
  }


}