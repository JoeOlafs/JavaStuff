import java.util.Scanner;
import java.lang.Math;

public class MathHelper{
     public static void main(String[] args){
          int input;
          
          System.out.println("Welcome to the math helper.");
          System.out.println("What would you like to calculate?");
          System.out.println("1. Sqrt");
          System.out.println("2. Log");
          System.out.println("3. Factorial");

          Scanner scan = new Scanner(System.in);
          int num = scan.nextInt();

          if(num == 1){ //Square root function
               System.out.println("What number would you like to Sqrt?");
               input = scan.nextInt();
               if(input < 0){
                    System.out.println(Math.sqrt(input));
               }
               else{
                    System.out.println("Can not take square root of this number");
               }
          }
          else if(num == 2){
               System.out.println("What number would you like to take the log of?");
               input = scan.nextInt();
               if(input < 0){
                    System.out.println(Math.log(input));
               }
               else{
                    System.out.println("You can not take the logarithm of a negative numeber");
               }
          }
          else if(num == 3){
               System.out.println("What number would you like to get the factorial of?");
               input = scan.nextInt();
               int output = 1;
               for(int i=1; i <= input; i++){
                    output *= i; 
               }
               System.out.println(output);
          }
          else{
               System.out.println("Invalid input");
          }
          scan.close();
     }
     public static int factorial(int input){
          int output = 1;
          for(int i=1; i <= input; i++){
               output *= i; 
          }
          return output;
     }
}

