package euler

/**
 * Created by Montana Ruth on 7/28/2015.
 */
object Euler12 extends App {
  val triangleNums = Stream.from(2).scanLeft(1)(_+_)

  println(triangleNums take 5 foreach println)
}