import scala.collection.mutable.Map

class Phrase(input: String) {
  def wordCount =
  {
    val words = input split "[!\\?:,\\.\\s\\&#\\^@\\$%]+"
    words.groupBy(_.toLowerCase()).mapValues(_.size)
  }
}