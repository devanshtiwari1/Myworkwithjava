package devansh;
import java.util.Scanner;
import java.util.Arrays;
public class ChangingCase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char d[]=s.toCharArray();
	for(int i=0; i<s.length();i++)
	{
		if(d[i]>='A' && d[i]<='Z')
			d[i]=(char) ((char) d[i]+32);
		else if(d[i]>='a' && d[i]<='z')
			d[i] =(char) ((char) d[i]-32);
	}
	System.out.println(d);
	}

}
