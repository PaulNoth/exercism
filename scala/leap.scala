case class Year(year: Int) {
  def isLeap = {
    if( year % 100 == 0)
      year % 400 == 0
    else
      year % 4 == 0
  }
}

