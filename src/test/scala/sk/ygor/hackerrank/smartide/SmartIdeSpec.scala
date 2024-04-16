package sk.ygor.hackerrank.smartide

import org.scalatest.FunSpec
import sk.ygor.codility.TestUtils

class SmartIdeSpec extends FunSpec with TestUtils {

  describe("Language") {

    it("should recognize Java") {
      val actual = runSolution(Solution.main(Array()), "sk/ygor/hackerrank/smartide/javaexamples.txt").trim
      assert(actual === "Java")
    }
    it("should recognize C") {
      val actual = runSolution(Solution.main(Array()), "sk/ygor/hackerrank/smartide/cexamples.txt").trim
      assert(actual === "C")
    }
    it("should recognize Python") {
      val actual = runSolution(Solution.main(Array()), "sk/ygor/hackerrank/smartide/pythonexamples.txt").trim
      assert(actual === "Python")
    }
  }

}
