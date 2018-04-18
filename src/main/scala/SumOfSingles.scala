object SumOfSingles {

  def sumInt(input: List[Int]): Int = {
    input.sum
  }

  def toDistinct(input: List[Int]): List[Int] = {
    input.distinct
  }

  def diffInputAndDistinct(input: List[Int]): List[Int] = {

    input.diff(toDistinct(input))
  }

  def showUniqueNumbers(input: List[Int]): List[Int] = {

    toDistinct(input).diff(diffInputAndDistinct(input))
  }

  def sumUniqueNumbers(input: List[Int]): Int = {
  showUniqueNumbers(input).sum
  }
}
