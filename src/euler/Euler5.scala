package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler5 extends App {
  val ans = (2520 to Int.MaxValue by 20).find(n => (11 to 20).forall(n % _ == 0)).getOrElse("None")
  println(ans)
}