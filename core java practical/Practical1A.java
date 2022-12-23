import java.util.*;
class Pract1_a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for(int x=1; x<=10; x++)
		{
			System.out.println(num*x);
		}
	}
}