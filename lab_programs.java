1)	     import java.util.Scanner;
class p{
static void f(){
Scanner s=new Scanner(System.in);
System.out.println("(1)know my balance (2)know my validity date");
System.out.println("(3)know no of free calls available (4)more");
System.out.println("input a key: ");
int Q=s.nextInt();
switch(Q){
case 1:
System.out.println("my balance is 100");
break;
case 2:
System.out.println("my validity date 19 nov");
break;
case 3:
System.out.println("you have 3");
break;
case 4:
s();
break;
default:
System.out.println("invalid input");
}
}
static void s(){
Scanner a=new Scanner(System.in);
System.out.println("(1)prepaid bill request (2)customer preferences");
System.out.println("(3)GRPS activation (4)special message offers");
System.out.println("(5)special GRPS offer (6)3G activation");
System.out.println("(7)go to back to previous menu");
int x=a.nextInt();
switch(x){
case 1:
System.out.println("10");
break;
case 2:
System.out.println("11");
break;
case 3:
System.out.println("12");
break;
case 4:
System.out.println("13");
break;
case 5:
System.out.println("14");
break;
case 6:
System.out.println("15");
break;
case 7:
f();
default:
System.out.println("invalid input");
}
}
public static void main(String args[]){
System.out.println("welcome to powered air service."+"\n"+"what would you like to do?");
f();
}
}
















2) class animal
{
void walk()
{
System.out.println("walking\n");
}
}
class bird extends animal
{
void fly()
{+
system.out.println("flying\n);
}
}
class p3
{
public static void main(string Args[])
{
bird a=new bird();
b.fly();
b.walk();
}
}



3)
import java.util.Scanner;
class p2{
public static void main(String args[]){
int l,b,p,a,i,n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.println("enter length");
l=s.nextInt();
System.out.println("enter breadth");
b=s.nextInt();
if(l<0||b<0)
System.out.println("invalid input");
else
{
p=2*(l+b);
System.out.println("perimeter is:"+p);
a=l*b;
System.out.println("Area is:"+a);
}
}
}
}



4)

import java.lang.*;
import java.util.Scanner;
class Arithmatic
{
 int add(int x,int y)
 {
  return(x+y);
 }
}
class Adder extends Arithmatic
{
 public static void main(String args[])
 {
  Adder addition=new Adder();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter first number:");
  int a=sc.nextInt();
  System.out.println("enter Second number:");
  int b=sc.nextInt();
  int sum=addition.add(a,b);
  System.out.println("Sum is"+sum);
 }
}


5)
class sports
{
 String getname()
 {
  return("name of sport");
 }
 String getNumberOfTeamMembers()
 {
  return("number of team members");
 }
}
class soccer extends sports
{
 String getname()
 {
  return("sports name");
 }
 String getNumberOfTeamMembers()
 {
  return("team members");
 }
 public static void main(String args[])
 {
  soccer x=new soccer();
  String s1=x.getname();
  String s2=x.getNumberOfTeamMembers();
  System.out.println(s1+'\n'+s2);
 }
}


6) import java.util.*;
class exp
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter the numbers (,): ");
String input = s.next();
StringTokenizer st = new StringTokenizer(input,",");
int sum = 0;
while(st.hasMoreTokens())
{
int n = 0;
n = Integer.parseInt(st.nextToken());
System.out.println("the Number is: "+n);
sum += n;
}
System.out.println("Sum of the numbers is: "+sum);
}
}

7)
abstract class shape
{
abstract void sides();
}
class trapezoid extends shape
{
void sides()
{
System.out.println("Number od sides of trapezoid:4");
}
}
class triangle extends shape
{
void sides()
{
System.out.println("Number of sides of triangle:3");
}
}
class hexagon extends shape
{
void sides()
{
System.out.println("Number of sides of hexagon:6");
}
}
class shapes
{
public static void main(String[] args){
   shape a = new trapezoid();
   a.sides();
   shape b = new triangle();
   b.sides();
   shape c = new hexagon();
   c.sides();
   }
}

8)
import java.util.*;
interface AdvancedArithmetic{
public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
public int divisor_sum(int n){
int i,sum=0;
for(i=1;i<=n;i++){
if(n%i==0)
 sum+=i;
}
System.out.println("the sum of its factors is :" + sum);
return 0;
}
}
public class prog8{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int a=input.nextInt();
MyCalculator myobj=new MyCalculator();
myobj.divisor_sum(a);
}
}

11)a)
#age program

import java.util.*;

class myexp extends Exception{
    myexp(){
        super();
    }
}

public class Main
{
public static void main(String[] args) {

Scanner in = new Scanner(System.in);
System.out.println("enter age: ");
int age = in.nextInt();

if(age<=18){
   try{
       throw new myexp();
   }
   catch(myexp e){
       System.out.println("Not eligible to vote"); 
   }
}
else{
 System.out.println("Eligible to vote!");
}
}
}

10)
#arithmetic exception
 import java.util.*;
public class Main
{
public static void main(String[] args) {
 
Scanner in = new Scanner(System.in);
int a,b;
System.out.println("enter two numbers: ");
a = in.nextInt();
b = in.nextInt();
try {
   System.out.println(a/b);
}
catch(Exception e){
   System.out.println("Any number cannot be divided by zero.");
}
}
}

11)b)

 
import java.util.*;
class MyException extends Exception {   
}
class customer {
    public int account_number;
    public int balance = 10000;
    customer(int account_number){
        this.account_number = account_number;   
    }
    void print(){       System.out.println("account number = "+account_number);  System.out.println("balance = "+balance);    
    }
    void withdraw(int withdraw_amount){
        if (withdraw_amount> balance){  
            try {
                // Throw an object of user defined exception
                throw new MyException();
            }
            catch (MyException ex) {
                System.out.println("In sufficient funds!!");   
            }    
        }
        else{      System.out.println("amount withdrawn successfully.");
            this.balance = this.balance - withdraw_amount;
        }
    }
    void deposit(int deposit_amount){
        this.balance += deposit_amount;     System.out.println("amount deposited!");
    }
}
public class Main
{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
customer obj = new customer(125468);
while (true){
   System.out.println("enter 1 for print.");
   System.out.println("enter 2 for withdrawal");
   System.out.println("enter 3 for deposit.");
       System.out.println("enter 4 to terminate program.");
       int choice;
       System.out.println("enter choice");
       choice = in.nextInt();
       if (choice == 4){
           System.out.println("program stopped.");
           Return
}
       else if(choice == 1){
           obj.print();
       }
       else if(choice == 2){
           System.out.println("enter withdrawal amount: ");
           int withdraw_amount = in.nextInt();
           
           obj.withdraw(withdraw_amount);
       }
       else if (choice == 3){
           System.out.println("enter deposit amount: ");
           int deposit_amount = in.nextInt();
           obj.deposit(deposit_amount);
       }
}
}
}
