package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler3 extends App {

  def primeFactors(num: Long): List[Long] = {
    val exists = (2L to Math.sqrt(num).toLong).find(num % _ == 0)
    exists match {
      case Some(n) => n :: primeFactors(num/n)
      case None => List(num)
    }
  }
  println(primeFactors(600851475143L).max)
}