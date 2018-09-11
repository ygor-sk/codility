package sk.ygor.codility.lesson04

class MaxCounters {

  def solution(instructions: Array[Int], counterCount: Int): Array[Int] = {
    var maximumValue = 0 // last maximum value found
    var minimumValue = 0 // minimum value, that every counter must have at any time
    val counters = Array.fill(counterCount)(0)
    instructions.foreach(counterIndex => {
      if (counterIndex < counterCount + 1) {
        val currentValue = Math.max(counters(counterIndex - 1), minimumValue)
        val newValue = currentValue + 1
        counters(counterIndex - 1) = newValue
        maximumValue = Math.max(maximumValue, newValue)
      } else {
        minimumValue = maximumValue
      }
    })
    for (i <- counters.indices) {
      counters(i) = Math.max(counters(i), minimumValue)
    }
    counters
  }

}
