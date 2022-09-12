package Automation;

public class Demo {
	public void mathematicaloperation(int a,int b) 
	{
		System.out.println(a*b);
	
	try 
	{
		System.out.println(a/b);
		}
	catch(Exception g)
	{
	System.out.println("Invalid input user");
	g.printStackTrace();
	}
	System.out.println("Thanks for watching");
	}
   public static void main(String[] args) {
	Demo obj = new Demo();
	obj.mathematicaloperation(8, 10);
	}
}
