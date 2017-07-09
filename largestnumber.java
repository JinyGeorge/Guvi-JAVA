import java.util.Scanner;
 
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int g, h, i;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      d = in.nextInt();
      e = in.nextInt();
      f = in.nextInt();
 
      if ( g > h && g > i )
         System.out.println("First number is largest.");
      else if ( h > g && h > i )
         System.out.println("Second number is largest.");
      else if ( i > g && i > h )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}
