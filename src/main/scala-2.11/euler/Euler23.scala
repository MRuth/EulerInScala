package euler

/**
  * Created by Montana Ruth on 7/12/2016.
  */

object Euler23 extends App {
  def isAbundant(num: Int) = {
    (1 to Math.sqrt(num).toInt).filter(num%_ == 0).flatMap(f => if(f != 1) List(f,num/f) else f::Nil).distinct.sum > num
  }
  val abundantNumbers = (1 to 28123).filter(isAbundant)

  val abundantCombinations = for{i <- abundantNumbers.indices
    j <- i until abundantNumbers.length
    sum = abundantNumbers(i)+abundantNumbers(j) if(sum <= 28123)} yield sum

  println((1 to 28123).diff(abundantCombinations).sum)
}
