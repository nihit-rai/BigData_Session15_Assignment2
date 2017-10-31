/**
 * This class provides a partial function to all two integers and constant
 * and another method to return square of integer
 * 
 */
class Problem1 {
  //Defining constant integer
  val constantInt: Int = 10;
  
  /**
   * Method to add two integers and return their sum
   */
  def add(a: Int, b: Int): Int = a + b;
  
  /**
   * Partial function to add two parameters and constant
   */
  object sumInt extends Function2[Int, Int, Int] {

  override def apply(x: Int, y:Int): Int = add(add(x,y), constantInt)
}
 
  /**
   * Method to return square of input parameter
   */
 def squareInt(i : Int):Int={
   var retVal : Int = i*i;
   return retVal;
 }
  
}

object MainObj{  
    def main(args:Array[String]){  
       var Problem1= new Problem1();
       //Testing partial function
       println("Partial function returns : "+Problem1.sumInt(5,6));
       println("Square function returns : "+Problem1.squareInt(Problem1.sumInt(5,6)));
    }  
}  
