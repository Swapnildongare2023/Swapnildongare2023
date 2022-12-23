import java.util.Scanner;
class Conversion
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Binary number: ");
	String num1 = sc.nextLine();
	System.out.print("Enter Decimal number: ");
	int num2 = sc.nextInt();
	System.out.println("Binary to Decimal: " + Integer.parseInt(num1,2));
	System.out.println("Decimal to Binary: " + Integer.toBinaryString(num2));
	}
}