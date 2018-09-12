package sk.ygor.codility.lesson05

class GenomicRangeQuery {

  final val LETTERS = Map('A' -> 1, 'C' -> 2, 'G' -> 3, 'T' -> 4)

  def solution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {
    val prefixOccurences = Array.fill(s.length + 1)(LETTERS.keys.map(_ -> 0).toMap)
    for (i <- s.indices) {
      val char = s(i)
      prefixOccurences(i + 1) = prefixOccurences(i).updated(char, prefixOccurences(i)(char) + 1)
    }
    p.zip(q).map {
      case (pi, qi) =>
        if (pi == qi) {
          LETTERS(s(pi))
        } else {
          val pCount = prefixOccurences(pi)
          val qCount = prefixOccurences(qi + 1)
          val sliceOccurences = LETTERS.keys.map(letter => letter -> (qCount(letter) - pCount(letter)))
          sliceOccurences.collectFirst {
            case (letter, occurences) if occurences > 0 => LETTERS(letter)
          }.get
        }
    }
  }

}
