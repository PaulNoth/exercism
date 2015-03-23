import scala.collection.immutable._

class School {

  private[this] var dataset: SortedMap[Int, Queue[String]] = SortedMap.empty
  
  def db = dataset
  
  def add(name: String, grade: Int): Unit = {
    val names = dataset.getOrElse(grade, Queue())
    dataset = dataset + ((grade, names enqueue name))
  }
  
  def sorted = dataset.mapValues { _.toList.sortWith(_ < _) }
  
  def grade(grade: Int) = dataset.getOrElse(grade, Queue())
}