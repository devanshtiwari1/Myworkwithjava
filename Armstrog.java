package devansh;
import java.util.Scanner;
public class Armstrog {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int c=0;
int temp=N;
while(N>0)
{
	int a=N%10;
    int b=N/10;
    N=b;
    c=c+(a*a*a);
}
if(temp==c)
	System.out.println("This is armstrong number");
	else 
	   System.out.println("Not armstrong");
sc.close();
}
}