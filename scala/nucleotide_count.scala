
class DNA(strand: String) {
  require(strand matches "[ACGT]*")
  
  def nucleotideCounts: Map[Char, Int] =
  {
    val emptyNuclMap = "ATCG".groupBy(_.toChar).mapValues(_ => 0)
    val nuclMap = strand.groupBy(_.toChar).mapValues(_.size)
    emptyNuclMap ++ nuclMap
  }
  
  def count(nucleotide: Char): Int = 
  {
    require("ATCG" contains nucleotide)
    strand.count(_ == nucleotide)
  }
}