object ETL {
  def transform(old: Map[Int, Seq[String]]) = {
    var result: scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map.empty
    old.keySet.toList.foreach { 
      key => 
        ((old get key) get).foreach { 
          value => 
            result = result += ((value.toLowerCase, key))
        }   
    }
    result.toMap
  }
}