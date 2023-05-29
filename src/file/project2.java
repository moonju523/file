package file;

import java.util.*;

class Monster{
   Scanner scanner=new Scanner(System.in);
   
   static int hp;
   
   void inputhp() {
      System.out.print(" enter the monster's hp: ");
       hp=scanner.nextInt();
   }
   static void hurt(int n) {
      hp=hp-n;
      System.out.println("MOnster's remained hp is "+Monster.hp);
   }
   
}
class Hunter{
   Scanner scanner=new Scanner(System.in);
   
   static int power;
   void inputattack() {
      System.out.print(" enter the power of hunter: ");
      power=scanner.nextInt();
   }
   
   void attack() {
      System.out.println(" Hunter attack the monster by"+Hunter.power);
      Monster.hurt(Hunter.power);
   }
}
public class project2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Monster m1=new Monster();
      Hunter h1=new Hunter();
      
      m1.inputhp();
      h1.inputattack();
      
      h1.attack();
   }

}