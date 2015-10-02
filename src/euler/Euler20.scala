package euler

/**
 * Created by Montana Ruth on 7/29/2015.
 */
object Euler20 extends App {
  def fact(num: BigInt) = (BigInt(1) to num).product

  println(fact(100).toString.map(_.asDigit).sum)
}