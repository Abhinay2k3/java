import java.util.*;
interface AdvancedArithmetic
{
  public abstract int divisorSum(int n);
}


class MyCalculator implements AdvancedArithmetic
{
    public int divisorSum(int n)
    {
        int sum=0,i=0,N=n;
        for(i=1;i<=N;i++)
        {
            if(n%i==0)
            sum=sum+i;
         }
        return sum;
    }
}



class p9
{

    public static void main(String []argh)
    {
       MyCalculator my_calculator=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(my_calculator.divisorSum(n)+"\n");
   }
   
    static void ImplementedInterfaceNames(Object o)
    {
      Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
           String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
