import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter String value: ");
	String original = sc.nextLine();
	String reverse = "";
	int length = original.length();
	for(int i = length-1; i>=0; i--)
	{
		reverse = reverse + original.charAt(i);
		System.out.println("Reverse of string: " + reverse);
	}
	}
}