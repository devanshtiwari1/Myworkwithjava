package devansh;
interface Test
{
	public void square();
}
class arithmatic implements Test
{
	public void square()
	{
		System.out.println("Hurray!!!!Square function is accessed....");
	}
}
public class asta
{
	public static void main(String[] args)
	{
		arithmatic obj = new arithmatic();
		obj.square();
	}
}
