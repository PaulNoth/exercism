/**
 * @author Pidanic
 */
class Bob 
{
  def hey(msg: String): String =
    if(silence(msg)) "Fine. Be that way!"
    else if(shouting(msg)) "Whoa, chill out!"
    else if(question(msg)) "Sure."
    else "Whatever."
  
  private def silence(msg: String): Boolean = msg.forall(_.isWhitespace)
  
  private def question(msg: String): Boolean = msg endsWith "?"
  
  private def shouting(msg: String): Boolean = {
    val letters = msg.filter(_.isLetter)
    !letters.isEmpty && letters.forall(_.isUpper)
  }
  
}