import java.util.*;
class Pract3_A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String Value: ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i<str.length(); i++)
		{
			if(Character.isLetter(ch[i]))
			{							
				letter++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{									
				space++;
			}
			else if(Character.isDigit(ch[i]))
			{								
				num++;
			}
			else
			{								
				other++;
			}
		}
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("Other Characters: " + other);
	}
}