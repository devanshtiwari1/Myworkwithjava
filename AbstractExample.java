package devansh;
 abstract class Animal
{
	abstract void AnimalVoice();
	void animalleg()
	{
		System.out.println("Animals have 4 leg");
	}
}
 class child1 extends Animal
{
	void AnimalVoice()
	{
		System.out.println("wheeee-pee-eee");
	}
}
public class AbstractExample  {
public static void main(String args[])
{
	child1 c=new child1();
	c.AnimalVoice();
	c.animalleg();
}

}
