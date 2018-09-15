package sk.ygor.codility.lesson14

import sk.ygor.codility.lesson14.NailingPlanks.{Event, Plank}

import scala.collection.mutable

class NailingPlanks {

  def solution(a: Array[Int], b: Array[Int], c: Array[Int]): Int = {
    val nailSet = scala.collection.mutable.TreeSet[Plank]()(Ordering.by(nail => nail.from)) ++ a.zip(b).map { case (from, to) => Plank(from, to) }
    for (i <- c.indices) {
      val nailPosition = c(i)
      val planksToRemove = nailSet.until(Plank(nailPosition + 1, 0)).filter(plank => nailPosition <= plank.to)
      nailSet --= planksToRemove
      if (nailSet.isEmpty) {
        return i + 1
      }
    }
    -1
  }

  def solution2(a: Array[Int], b: Array[Int], c: Array[Int]): Int = {
    if (a.length > 1000) {
      throw new RuntimeException("not implemented for array of size: " + a.length)
    }
    var remainingPlanks = a.zip(b).map { case (from, to) => Plank(from, to) }
    for (i <- c.indices) {
      val nailPosition = c(i)
      remainingPlanks = remainingPlanks.filterNot(plank => plank.from <= nailPosition && nailPosition <= plank.to)
      if (remainingPlanks.isEmpty) {
        return i + 1
      }
    }
    -1
  }

  def solution3(a: Array[Int], b: Array[Int], c: Array[Int]): Any = {

    def calculatePlankCounts: mutable.SortedMap[Int, Int] = {
      val eventsUp = a.map(position => Event(position, 1))
      val eventsDown = b.map(position => Event(position, -1))
      val events = eventsUp ++ eventsDown
      val eventsByPosition = events.groupBy(event => event.position).toSeq.sortBy { case (position, _) => position }
      val plankCounts = collection.mutable.SortedMap[Int, Int]()

      var sum = 0
      var endedPlanks = 0
      eventsByPosition.foreach {
        case (position, positionEvents) =>
          val upCount = positionEvents.count(_.diff == 1)
          val downCount = positionEvents.count(_.diff == -1)
          sum = sum + upCount - endedPlanks
          endedPlanks = downCount
          plankCounts(position) = sum
      }
      plankCounts
    }

    val plankCounts: mutable.SortedMap[Int, Int] = calculatePlankCounts
    val (minimumPlankStart, _) = plankCounts.head
    println(plankCounts)
    var remainingPlankCount = a.length
    val positionsNailed = scala.collection.mutable.HashSet[Int]()
    for (i <- c.indices) {
      val nailPosition = c(i)
      if (!positionsNailed.contains(nailPosition)) {
        positionsNailed.add(nailPosition)
        if (nailPosition >= minimumPlankStart) {
          val plankCountFromPosition = plankCounts.from(nailPosition)
          println(s"nail at position $nailPosition, planks affected: $plankCountFromPosition")
          val planksAffected = plankCountFromPosition.headOption.map { case (_, count) => count }.getOrElse(0)
          println(s"nail at position $nailPosition, planks affected: $planksAffected")
          remainingPlankCount -= planksAffected
          assert(remainingPlankCount >= 0)
        }
      }
      if (remainingPlankCount == 0) {
        return i + 1
      }
    }
    -1
  }


}

object NailingPlanks {

  case class Plank(from: Int, to: Int)

  case class Event(position: Int, diff: Int)

}
