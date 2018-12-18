import java.util.Scanner;

public class buissness {

    public static void main(String []args){

  Scanner keyboard=new Scanner(System.in);

 System.out.println("Amount of lemons");
 double lemons=keyboard.nextInt();

 System.out.println("Cost 0f lemons");
double costOne=keyboard.nextDouble();

System.out.println("Amount of Sugar ");
double sweet=keyboard.nextDouble();

 System.out.println("Cost of Sugar ");
 double costTwo=keyboard.nextDouble();

 System.out.println("Amount of cups ");
double cupsnumb=-keyboard.nextDouble();

System.out.println("Cost  of Cups");
double cupsco=keyboard.nextDouble();


double Lemonz=(lemons/costOne);

double Cupz=(cupsnumb/cupsco);

double biterr=(cupsnumb/costTwo);



double totalCom=(Lemonz+Cupz+biterr);
System.out.println(totalCom);







/*


 System.out.println("Total cost");
 double totalCost=keyboard.nextDouble();

 System.out.println("Sales ");
 double sales=keyboard.nextDouble();

 System.out.println("Your profit is $" +(  sales-totalCost));
*/
    }
}


