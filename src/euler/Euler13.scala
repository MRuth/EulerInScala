package euler

import scala.io.Source

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler13 extends App {
  println(Source.fromFile("Files/Euler13In.txt").getLines.map(BigInt(_)).sum.toString.take(10 ))
}