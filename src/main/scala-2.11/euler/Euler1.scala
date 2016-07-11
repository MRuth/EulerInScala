package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler1 extends App{
  println((1 until 1000).filter(e => (e % 3 == 0) || (e % 5 == 0)).sum)
}
