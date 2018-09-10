package sk.ygor.codility.lesson03

import org.scalatest.FunSpec

class FrogJmpSpec extends FunSpec {

  val frogJmp = new FrogJmp

  val examples = Seq(
    (10, 85, 30) -> 3,
    (10, 99, 30) -> 3,
    (10, 100, 30) -> 3,
    (10, 101, 30) -> 4,
  )

  describe("FrogJmp") {
    examples foreach {
      case ((from, to, step), result) => it(s"should jump $result times from $from to $to, with step of $step") {
        assert(frogJmp.solution(from, to, step) === result)
      }
    }
  }

}
