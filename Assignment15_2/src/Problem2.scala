
/**
 * this class provides method matchCourses to return price of course entered
 */
class Problem2 {
  
  def matchCourses(x: String): Int = x.toUpperCase() match {
      case "ANDROID" => 12999
      case "BIG DATA DEVELOPMENT" => 17999
      case "SPARK" => 19999
      case _ => 0 
   }
}

//Main object
object MainDemo {
   def main(args: Array[String]) {
     while( true )
     {
     val input: String = readLine("enter course> ");
     var obj = new Problem2();
     var price: Int = obj.matchCourses(input);
     if(price==0)
     {
       println("Course not found. Closing this app.");
      return;
     }
     else
     {
       println("Price of "+input+" is " + price);
     }
     }
   }
     
   }