import java.util.*; 
import java.io.*;

class Main {  
  public static int SimpleAdding(int num) {  
   
       int total=0;
       while(num>0){
           total=total+num;
           num--;
           
       }
       
    return total;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAdding(s.nextLine())); 
  }   
  
}