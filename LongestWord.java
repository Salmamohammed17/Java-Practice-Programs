import java.util.*; 
import java.io.*;
class Main {  
  public static String LongestWord(String sen) { 
  
  
       String words[]=sen.split(" ");
       int j=0;
       for(int i=1;i<words.length;i++){
           if(words[i].length()>words[j].length()){
               j=i;
           }
           
       }
      
       
    return  words[j];
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}