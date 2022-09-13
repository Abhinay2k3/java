import java.util.Scanner;
class menu{
    public void mainmenu(){
        System.out.println("a.know my balance     b.know my validity    c.know my free calls    d.more");
        System.out.println("enter 0 to exit");
    }
    public void balance(){
        System.out.println("$23");
    }
    public void validity(){
        System.out.println("22/12/2024");
    }
    public void freecalls(){
        System.out.println("they are only 100 calls left");
    }
    public void more(){
        System.out.println(" 1.Prepaid bill\n"+
                " 2.customer preference\n"+
                " 3.special message offers\n "+
                " 4.special GRPS offer\n"+
                " 5.special GRPS activation\n"+
                " 6.3G activation\n"+
                " 7.Go to previous menu\n");
    }

}

public class m1 {
    public static void main(String[] args){
        System.out.println("welcome to powered air");
        menu obj=new menu();
        Scanner scan=new Scanner(System.in);
        boolean t=true;
        while(t){
            obj.mainmenu();
            System.out.println("enter your choice : ");
            char inp=scan.next().charAt(0);
            if(inp=='a') {
                obj.balance();
            }
            else if (inp =='b') {
                    obj.validity();
                }
            else if(inp=='c'){
                obj.freecalls();
            }
            else if(inp=='d'){
                obj.more();
                char men=scan.next().charAt(0);
                if (men=='0'){
                    t=false;
                }
                else{
                    System.out.println("Service unavailable");
                }
            }
            else if(inp=='0'){
                t=false;
            }
        }
    }

}
