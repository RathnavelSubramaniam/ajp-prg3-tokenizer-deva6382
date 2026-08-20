import java.util.ArrayList;
import java.util.Scanner;

class Practical3 {
   Practical3() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a line of text:");
      String var2 = var1.nextLine();
      String[] var3 = var2.split(" ");
      ArrayList var4 = new ArrayList();

      for(String var8 : var3) {
         if (var8.toLowerCase().startsWith("b")) {
            var4.add(var8);
         }
      }

      ArrayList var10 = new ArrayList();

      for(String var9 : var3) {
         if (var9.toUpperCase().endsWith("ED")) {
            var10.add(var9);
         }
      }

      System.out.println("Words starting with 'b': " + String.valueOf(var4));
      System.out.println("Words ending with 'ED': " + String.valueOf(var10));
   }
}