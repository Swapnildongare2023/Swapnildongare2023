class College
{
	public void move()
	{	
		System.out.println("College is open.");
	}
}	
class BMS extends College
{
	public void move()
	{	
		
		System.out.println("BMS building is also open.");
	}
}	
class Students
{
	public static void main(String args[])
	{
		College a = new College();
		BMS b = new BMS();
		a.move();
		b.move();
	}
}