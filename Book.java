package devansh;
import java.util.Scanner;
abstract class MyBook {
	String title;
		abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}
}
	class Bookextend extends Book
	{
		void setTitle()
		{
			System.out.println("A tale of two cities");
		}
	void getTitle()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String title= in.nextLine();
		System.out.println("You entered string "+title);
	}
	}
	class Book
	{
		public static void main(String[] args)
		{
			Bookextend b=new Bookextend();
			b.setTitle();
			b.getTitle();
			
		}
	}

