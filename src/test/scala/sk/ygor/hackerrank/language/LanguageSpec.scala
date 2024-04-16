package sk.ygor.hackerrank.language

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class LanguageSpec extends FunSpec with TestUtils {

  describe("Language") {

    it("should work") {
      val actual = runSolution(Solution.main(Array()), "sk/ygor/hackerrank/language/input.txt")
      val expected = readFile("sk/ygor/hackerrank/language/output.txt")
      assert(actual === expected)
    }
  }

}
