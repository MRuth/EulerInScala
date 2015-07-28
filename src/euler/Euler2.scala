package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler2 extends App {

  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  println(fibs drop 2 takeWhile(_ < 4000000) filter(_ % 2 == 0) sum)
}