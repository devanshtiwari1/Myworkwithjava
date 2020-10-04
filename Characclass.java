package devansh;
import java.util.regex.Pattern;

public class Characclass {
	//quantifiers:     number of occurence
	//x?                        once or no
    //x*                         zero or more

     //x+                        one or more
      public static void main(String args[]) 
      {
      System.out.println(Pattern.matches("[abc]{4}", "aaaa"));
      }  
     }