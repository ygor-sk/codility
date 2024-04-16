package sk.ygor.hackerrank.splitnumber

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class SplitNumberSpec extends FunSpec with TestUtils {

  describe("Language") {

    it("should work") {
      val actual = runSolution(Solution.main(Array()), "sk/ygor/hackerrank/splitnumber/input.txt")
      val expected = readFile("sk/ygor/hackerrank/splitnumber/output.txt")
      assert(actual === expected)
    }

  }

}
