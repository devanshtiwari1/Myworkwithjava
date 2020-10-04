package devansh;

import java.util.Scanner;

public class Countvariables {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of string");
		String s=obj.nextLine();
		int coa=0;
		int cob=0;
		int coc=0;
		for(int i=0;i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch  == 'a')
			{
				++coa;
			}
			else if(ch == 'b')
			{
				++cob;
			}
			else if(ch=='c')
			{
				++coc;
			}
			else
			{
				System.out.print(0);
			}
		}
		
		System.out.print("a"+coa);
		System.out.print("b"+cob);
		System.out.print("c"+coc);
		
		}
}
