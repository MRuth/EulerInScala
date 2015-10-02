package euler

/**
 * Created by Montana Ruth on 7/30/2015.
 */
object Euler25 extends App {
  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  println(fibs.zipWithIndex.filter{ _._1.toString().length >= 1000}.head._2)
  println("CABO ROJO                     ".replaceAll("[ \\t]{2,}",""))
}