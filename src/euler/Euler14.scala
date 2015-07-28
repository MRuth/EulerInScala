package euler

import scala.annotation.tailrec

/**
 * Created by Montana Ruth on 7/28/2015.
 */

@tailrec
object Euler14 extends App {
  def collatzSequence(start: Long) = {
    def loop(n: Long, lenght: Long):Long = {
      if(n == 1)
        lenght + 1
      else if(n % 2 == 0)
        loop(n/2,lenght + 1)
      else
        loop(3*n+1,lenght + 1)
    }
    loop(start,0)
  }

  val start = System.currentTimeMillis()
  val ans = (1 to 1000000).par.maxBy(collatzSequence(_))
  val end = System.currentTimeMillis()

  println(ans)
  println(end-start)
}