package school;

import java.util.Scanner;

public class MEtest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      try {
         int a;
         a=Inputtt();
         
         System.out.println("number = " +a);
      }
      
      catch(Myexception e) {
         System.out.println("!! odd exception occurs !! ");
      }
   }
   
   public static int Inputtt() throws Myexception{
      Scanner sc=new Scanner(System.in);
      
      int a=sc.nextInt();
      if (a%2==1) throw new Myexception();
      return a;
   }

}

class Myexception extends Exception{
   public Myexception() {
      System.out.println("!! odd exception occurs !!");
   }
}