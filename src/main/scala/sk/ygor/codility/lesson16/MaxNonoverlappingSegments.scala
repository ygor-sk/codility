package sk.ygor.codility.lesson16

class MaxNonoverlappingSegments {

  def solution(a: Array[Int], b: Array[Int]): Int = {
    val segments = a.zip(b).map { case (from, to) => Segment(from, to) }
    var result = 0
    var lastEnd = -1
    segments.foreach(segment => {
      if (segment.from > lastEnd) {
        result +=1
        lastEnd = segment.to
      }
    })
    result
  }


  case class Segment(from: Int, to: Int)

}
