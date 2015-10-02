package euler

import scala.io.Source

/**
 * Created by Montana Ruth on 7/29/2015.
 */
object Euler22 extends App {
  val names = Source.fromFile("Files/Euler22Names.txt").getLines.mkString.replaceAll("\"","").split(",").sorted.toList
  println(names.zip(Stream.from(1)).map{t => t._1.map(_ - 'A' + 1).sum * t._2}.sum)
}