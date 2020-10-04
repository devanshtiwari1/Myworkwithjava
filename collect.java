package devansh;

import java.util.ArrayList;

public class collect {
	public static void main(String args[])
			{
		ArrayList obj=new ArrayList();//just for string write it as ArrayList<String> obj=new ArrayList<String>(); now put every object as String
		obj.add(5);
		obj.add(5.0);
		obj.add("Hello");
		obj.add('a');
		System.out.print(obj);
			}

}
