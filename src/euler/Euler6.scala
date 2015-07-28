package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler6 extends App {
  val sumOfSquares = (1 to 100).map(n => n * n).sum
  val squareOfSums = {
    val sum = (1 to 100).sum
    sum * sum
  }

  println(Math.abs(squareOfSums - sumOfSquares))
}