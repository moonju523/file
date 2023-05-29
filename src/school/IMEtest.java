package school;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMEtest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      try {
         int a,b;
         a=sc.nextInt();
         b=sc.nextInt(); //cannot input character
         
         System.out.println("result = "+(a+b));
      }
      catch (InputMismatchException e) {
         System.out.println("!! InputMismatch !!");
      }
   }

}