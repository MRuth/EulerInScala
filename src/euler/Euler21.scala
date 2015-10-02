package euler

/**
 * Created by Montana Ruth on 7/29/2015.
 */
object Euler21 extends App {

  def divisorsOf(num: Int): Seq[Int] = {
    if (num == 0)
      Seq()
    else
      (1 +: (2 to Math.sqrt(num).toInt).filter(num % _ == 0).flatMap(n => List(n,num/n))).distinct.toArray.sorted
  }

  def isAmicableNumber(a: Int) = {
    val dOfA = divisorsOf(a).sum
    val dOfB = divisorsOf(dOfA).sum
    dOfB == a && dOfA != dOfB
  }

  println((1 until 10000).filter(isAmicableNumber).sum)
}