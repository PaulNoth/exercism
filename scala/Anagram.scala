class Anagram(input: String)
{
  def matches(seq: Seq[String]): Seq[String] =
  {
    val permutations = input.permutations.toSeq.map(_.toLowerCase.sorted).distinct
    seq.filter(s => permutations.contains(s.toLowerCase.sorted)).filter(_.toLowerCase != input.toLowerCase)
  }
}