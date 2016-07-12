package euler

/**
  * Created by Montana Ruth on 7/12/2016.
  */

object Euler29 extends App {
  println(
    (for(a <- 2 to 100; b <- 2 to 100) yield Math.pow(a,b)).distinct.length
  )
}
