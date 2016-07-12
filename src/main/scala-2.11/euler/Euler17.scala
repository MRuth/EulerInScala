package euler

import scala.annotation.tailrec

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler17 extends App {

  val ones = List("one","two","three","four","five","six","seven","eight","nine")
  val tens = List("ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety")
  val elevenToNineteen =
    List("eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen")

  @tailrec
  def getNumString(num: Int,currStr: String = ""): String = {
    val numStr = num.toString
    val numDigits = numStr.size

    if (numDigits == 4)
      return currStr + "onethousand"
    else if (num > 10 && num < 20)
      return currStr + elevenToNineteen(numStr.tail.toInt - 1)
    else if (numDigits == 3)
    {
      val and = if (numStr.tail != "00") "and" else ""
      getNumString(numStr.tail.toInt, currStr + ones(numStr.head.asDigit - 1) + "hundred"+ and)
    }
    else if(numDigits == 2)
      getNumString(numStr.tail.toInt, currStr + tens(numStr.head.asDigit - 1))
    else if(numDigits == 1 && num != 0)
      return currStr + ones(numStr.head.asDigit - 1)
    else
      return currStr + ""
  }

  val numsAsStrings = (1 to 1000).map(getNumString(_))
  println(numsAsStrings.mkString.size)
}