package sk.ygor.codility.lesson07

import scala.collection.mutable

class Brackets {

  final val PAIRS = Map(
    '(' -> ')',
    '{' -> '}',
    '[' -> ']'
  )

  def solution(s: String): Int = {
    val stack = mutable.ArrayStack[Char]()
    s.foreach { ch =>
      if (PAIRS.contains(ch)) {
        stack.push(ch)
      } else {
        if (stack.isEmpty) {
          return 0
        } else {
          val top = stack.pop()
          val isValid = PAIRS.exists {
            case (opening, closing) => opening == top && closing == ch
          }
          if (!isValid) {
            return 0
          }
        }
      }
    }
    if (stack.isEmpty) 1 else 0
  }

}
