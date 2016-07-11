package euler

/**
 * Created by Montana Ruth on 7/29/2015.
 */
object Euler24 extends App {
  val permStr = "0123456789"
  println(permStr.permutations.toArray.sorted.toList(1000001))
}