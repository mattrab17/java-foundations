package src.week2.wednesday;
import java.util.Stack;
public class warmup {


  //Warmup: reverse a string using a stack

  //input: String with letters
  //Case 1: String is empty or String is null -> Don't print reversal
  //Case 2: Length is at least 1
  //      -> Loop through string and put each letter into a stack
  //      -> Loop (as long as stack is not empty), and keep popping out the letters one by one and add them to a variable "Reversed String"
  public static void main (String[]args){

   

    System.out.println(warmup.reverseString("qwertyuiop"));

  }

  public static String reverseString(String x){
    
    if(x == null || x.trim().isEmpty()){
      return "The String is null or empty";
    }

    Stack<String> stack = new Stack();
    for(int i = 0; i < x.length(); i++){
      
      stack.push(x.substring(i,i+1));
      
    }
   

    String reversedString = "";
     while(!stack.isEmpty()){
      reversedString += stack.pop();
    }
    
    return reversedString;

  }
  
}
