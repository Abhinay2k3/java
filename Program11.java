import java.util.Scanner;
import java.util.Random;
class customer1 extends Exception
{
customer1(String str)
{
super(str);
}
}
class customer
{
Random rand = new Random();
int account,balance=10000;
void account_no()
{
account=rand.nextInt();
}
void withdraw (int price)
{

if(price>balance)
{
try
{
throw new customer1("Insufficent Funds");}
catch(customer1 e)
{
e.printStackTrace();
}
}
else{
balance=balance-price;
System.out.println("You have withdraw Rs "+price);
}

}
void deposit(int k)
{
balance=balance+k;
System.out.println("You have deposited Rs "+k);
}
void print()
{
System.out.println("Your Current ammount is "+balance);
}
}
class exp11
{
public static void main(String args[])
{
customer cs = new customer();
Scanner s = new Scanner(System.in);
int k=0;
while(k==0)
{
System.out.println("1 : Print the current balance");
System.out.println("2 : Withdrawing Amount");
System.out.println("3 : Deposit Amount");
System.out.println("4 : Exit");
System.out.print("Enter ur choice :");
int c = s.nextInt();
if(c==1)
{
cs.print();
}
else if(c==2)
{
System.out.println("Enter the amount to be withdraw :");
int a = s.nextInt();
cs.withdraw(a);
}
else if (c==3)
{
System.out.println("Enter the amount to be Deposit :");
int b = s.nextInt();
cs.deposit(b);
}
else if (c==4)
{
k=1;
break;
}
else
System.out.println("Enter a valid response");
}
}
}
