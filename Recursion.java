public class Recursion{
     public static int factorial(int num){
          int total;
          if(num == 1)
               total = 1;
          else
               total = num * factorial(num - 1);
          return total;
     }
     public static void main(String[] args){
          System.out.println(factorial(10));
     }
}
