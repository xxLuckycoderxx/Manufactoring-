import java.util.Scanner;

public class buissness {

    public static void main(String []args){

  Scanner keyboard=new Scanner(System.in);

 System.out.println("Number of materials");
 int supplies=keyboard.nextInt();


 System.out.println("Cost of materials");
 int cost=keyboard.nextInt();
 System.out.println("Sales ");
 int sales=keyboard.nextInt();

 System.out.println("Your profit is $" +(  sales-cost));
    }
}

