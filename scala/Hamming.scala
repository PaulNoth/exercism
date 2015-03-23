class Hamming 
{
}

object Hamming
{
  def compute(dna1: String, dna2: String): Int = 
  {
//    var diff: Int = 0
//    val min = dna1.length min dna2.length
//    for(i <- 0 until min; if dna1(i) != dna2(i) )
//      diff += 1
//    diff
    (dna1 zip dna2).count { case (s1, s2) => s1 != s2}
  }
}