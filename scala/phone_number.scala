class PhoneNumber(private val phoneNo: String) {

  private val digits = phoneNo.filter(_.isDigit)
  
  def number(): String = 
  {
    if(digits.length == 10) 
      digits
    else if(digits.length == 11 && digits.head == '1')
      digits takeRight 10
    else
      "0" * 10
  }
  
  def areaCode = number take 3
  
  override def toString = "(%c%c%c) %c%c%c-%c%c%c%c" format (number.toCharArray :_*)
  
}