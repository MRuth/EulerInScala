package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler4 extends App {
  def isPalindrome(n: Int) = {
    val nStr = n.toString
    nStr == nStr.reverse
  }

  val palNums = for(x <- 100 to 999; y <- 100 to 999 if(isPalindrome(x*y))) yield x*y
  println(palNums max)
}