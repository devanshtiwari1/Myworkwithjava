package devansh;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class checkcorrect
	{
		public static void main(String args[])
		{
			String regex="[A-Z a-z 0-9 ]*@gmail.com";
			Pattern patt=Pattern.compile(regex);
			System.out.println("enter the number of emails u want to check");
			Scanner obj=new Scanner(System.in);
			int n=obj.nextInt();
			for(int i=0;i<=n; i++)
			{
				System.out.println("enter the string");
				String string=obj.nextLine();
				Matcher matt1=patt.matcher(string);
				System.out.println(matt1.matches());
			}
		}

}
