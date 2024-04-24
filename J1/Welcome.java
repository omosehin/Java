import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.transform.Source;

public class Welcome{
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // int number1;
        // int number2;
        // int sum;

        // System.out.print("Enter first integer: ");
        // number1 = input.nextInt();

        // System.out.print("Enter second integer: ");
        // number2 = input.nextInt();

        
        // if(number1 == number2)
        //     System.out.printf("%d == %d%n", number1,number2);

        // sum = number1  + number2;
        // System.out.printf("Sum is %d%n", sum);
/* 
       int c;
       int thisIsAVariable;
       int q76354;
       int number;

       Scanner input = new Scanner(System.in);

       System.out.print("Input an integer :");

       int variable=input.nextInt();

       System.out.println("This is a Java Program");

       System.out.printf("%s%n%s%n", "This is a Java","Program");
    
       if(variable != 7){
            System.out.print("The variable is not equal to 7");
       }
*/
/* 
      int x,y,z,result;

      Scanner input = new Scanner(System.in);
      System.out.println("First Number ");

      x= input.nextInt();

      System.out.println("Second Number ");

      y= input.nextInt();

      System.out.println("Third Number ");

      z= input.nextInt();

      result = x * y *z;
      System.out.printf("Product is %d%n",result);

      */
      /* 

      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer: ");

      int a = input.nextInt();

      System.out.println("Enter an integer: ");

      int b = input.nextInt();

      int c = b * a;
    
      //performs a sample payroll calculation

       System.out.println(c);
      

       int x = 2,y=3;

       System.out.printf("x= %d%n", x);

       System.out.printf("Value of %d + %d is %d%n",x,x,(x+x));
       //Value of 2 + 2 is  4

       System.out.printf("a=2");
       System.out.printf("%d = %d%n", (x + y), (y + x));
       // 5=5
    
    System.out.println("1 2 3 4");
    System.out.println(" 1 2 3 4");
    System.out.println("  1 2 3 4");
    System.out.println("   1 2 3 4");
    System.out.println("    1 2 3 4");
    System.out.printf("     1 2 3 4");
    
    System.out.println("**********");
    System.out.println("*        *");
    System.out.println("*        *");
    System.out.println("*        *");
    System.out.println("*        *");
    System.out.println("*        *");
    System.out.println("*        *");
    System.out.println("*        *");
    System.out.println("**********");

    System.out.println("    *    ");
    System.out.println("   * *   ");
    System.out.println("  *   *  ");
    System.out.println(" *     * ");
    System.out.println("*       *");
    System.out.println(" *     * ");
    System.out.println("  *   *  ");
    System.out.println("   * *   ");
    System.out.println("    *    ");

    
    Scanner input = new Scanner(System.in);
    int i,j,k,l,m;
    System.out.println("Enter an integeri: ");
    i = input.nextInt();

    System.out.println("Enter an integerj: ");
    j = input.nextInt();

    System.out.println("Enter an integerk: ");
    k = input.nextInt();

    System.out.println("Enter an integerl: ");
    l = input.nextInt();

    System.out.println("Enter an integerm: ");
    m = input.nextInt();
    
        if(i > j && i > k && i > l && i > m){
        System.out.printf("i is greatest with value of %d%n",i);
        }
    */
/* 
    if (i % 2 == 0){
            System.out.printf("i is an even number %d%n",i);
        }
        else{
            System.out.printf("i is an old number %d%n",i);
        }


for (int m2 = 0; m2 <= 8; m2++) {
    if(m2 % 2 == 0){
        System.out.println("* * * * * * * *");
    }else{
        System.out.println(" * * * * * * * *");
    }
}
*/
/*
int num;
Scanner input = new Scanner(System.in);
System.out.print("Enter a number with five digits: ");	// prompt

 num = input.nextInt();

 if (num > 10000 && num <= 99999) {
    System.out.printf("%d   ", (num / 10000));
    System.out.printf("%d   ", (num / 1000) % 10);
    System.out.printf("%d   ", (num / 100) % 10);
    System.out.printf("%d   ", (num % 100) / 10);
    System.out.printf("%d   ", (num % 10)); }

    // if entered number more than five digits
		if (num > 99999)
        System.out.println("You had entered a number more than five digits.");
    
    // if entered number less than five digits
    if (num <= 9999)
        System.out.println("You had entered a number less than five digits.");


//System.out.println("Enter a radius: ");

//int radius = input.nextInt();

//System.out.printf("diameter of %d is %d%n",radius,2 *radius);
//System.out.printf("circumference of %d is %f%n",radius,2 *radius * Math.PI);
//System.out.printf("area of %d is %f",radius,radius *radius * Math.PI);
//System.out.printf("The character %c has the value %d%n", 'A', ((int) '$'));
 */

 /*
 int minVal = 0;

 System.out.printf("%s %s %s%n", "number ","square ", "cube ");
 while (minVal <=10) {
    System.out.printf("%d %s %d %s %d%n",minVal,"     ",minVal*minVal,"     ",minVal*minVal*minVal);
    minVal++;
}

 */

 String name =  JOptionPane.showInputDialog("What is your name?");
 String message = String.format("Welcome , %s, to Java Programming!",name);
 JOptionPane.showMessageDialog(null, message);

    }
}