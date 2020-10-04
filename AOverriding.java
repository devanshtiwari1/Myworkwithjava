package devansh;
 class parent
{
	void show()
	{
		System.out.println("hello");
	}
}
 class child extends parent
{
	void show()
	{
		System.out.println("world");
	}
}
public class AOverriding
{
	public static void main(String args[])
	{
		child obj=new child();
		parent obj2=new child();
		obj.show();
		obj2.show();
	}
}