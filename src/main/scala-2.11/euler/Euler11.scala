package euler

import scala.io.Source

/**
  * Created by Montana Ruth on 7/11/2016.
  */

object Euler11 extends App {
  val grid = Source.fromFile("Files/Euler11.in").getLines.map(_.split(" ").map(_.toInt)).toArray

  def getNumAtPos(x: Int, y: Int): Int =
    (for(arr <- grid.lift(y); v <- arr.lift(x)) yield{v}) match {
      case Some(n: Int) => n
      case None => 0
    }

  def getProductAllDirections(x: Int, y: Int): Array[Int] = {
    val range = (0 to 3)
    val vertical = (for(offset <- range) yield getNumAtPos(x,y+offset)).product
    val horizontal = (for(offset <- range) yield getNumAtPos(x+offset,y)).product
    val diagUp = (for(offset <- range) yield getNumAtPos(x+offset,y-offset)).product
    val diagDown = (for(offset <- range) yield getNumAtPos(x+offset,y+offset)).product

    Array(vertical,horizontal,diagUp,diagDown)
  }

  val maxProduct =
    (for(y <- grid.indices; x <- grid(y).indices) yield getProductAllDirections(x,y)).flatten.max

  println(s"Max product: $maxProduct")
}