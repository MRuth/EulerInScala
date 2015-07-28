package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler15 extends App {
  def fact(num: BigInt) = (BigInt(1) to num).par.product

  def numPaths(num: Int) = fact(num*2)/(fact(num)*fact(num))

  println(numPaths(20))
}