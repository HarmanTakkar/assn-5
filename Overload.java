class A
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
}
	
public class Overload
{
	public static void main(String[] args)
	{
		A a=new A();
		a.add(10,9);
		a.add(10.7f,10.1f);
	}
}