class oopsexp extends exception
{
	oops exception (string str)
	{
		super(str);
	}
}
public class test
{
public static void validdate(int age)
{
if(age<18)
{
throw new oopsexp("person is not eligible");
}
else
{
System.out.println("person is eligible to vote");
}
}
public  static void main(String args[])
{
validdate(20);
}
}
