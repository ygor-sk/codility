package sk.ygor.codility.lesson02

class OddOccurrencesInArray {

  def solution(a: Array[Int]): Int = {
    val unpaired = scala.collection.mutable.SortedSet.empty[Int]
    a.foreach(x => {
      if (!unpaired.add(x)) {
        unpaired.remove(x)
      }
    })
    unpaired.size match {
      case 0 => throw new RuntimeException("no result")
      case 1 => unpaired.firstKey
      case _ => throw new RuntimeException(s"multiple results: ${unpaired.mkString(", ")}")
    }
  }

  def solution2(a: Array[Int]): Int = {
    var result = 0
    for (i <- a.indices) {
      result = result ^ a(i)
    }
    result
  }
}
