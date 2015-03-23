import scala.util.Random
import scala.collection.mutable.Set

class Robot {
  
  private val random = new Random
  private val nameCache: Set[String] = Set.empty
  
  var name:String = generateName
  
  def reset(): Unit = {
    name = generateName
  }
  
  
  private def generateName: String = {
    var newName = stringGenerator
    while(!(nameCache contains newName)) {
      newName = stringGenerator
    }
    nameCache += newName
    newName
  }
  
  private def stringGenerator:String = {
    random.nextString(2).toUpperCase + random.nextInt(1000).formatted("%03d")
  }
}