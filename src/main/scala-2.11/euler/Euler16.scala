package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler16 extends App {
  println(BigInt(2).pow(1000).toString.map(_.asDigit).sum)
}