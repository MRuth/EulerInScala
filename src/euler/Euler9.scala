package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler9 extends App {
  def isTriplet(a: Int, b: Int, c: Int, sum: Int) =
  {
    (a*a) + (b * b) == (c*c) &&
      a+b+c == sum &&
      a < b && b < c
  }

  val triplets = for(a <- 1 to 1000; b <- a to 1000; c <- b to 1000 if(isTriplet(a,b,c,1000))) yield (a,b,c)

  val ans = triplets.head._1 * triplets.head._2 * triplets.head._3
  println(ans)
}