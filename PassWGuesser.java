import java.util.Random;
import java.util.Scanner;
public class PassWGuesser
{
   static Random random = new Random();
   public static void main(String[]args)
   {
      String Rpass;
      Scanner scanner = new Scanner(System.in);
      System.out.println("This is just the input section and can be modified to accept external inputs \n Enter your password");
      Rpass= scanner.nextLine();
      //log of usable caharacters
      String[] symbols={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","y","x","1","2","3","4","5","6","7","8","9","0"};
      //declaring and setting both to empty
      String Gpass="";
      String PassSave="";
      while(!Gpass.equals(Rpass))
      {
      System.out.println(PassSave);
      PassSave="";
         //puts random characters together until the string is the length of the password
         for(int i=0;i<Rpass.length();i++)
         {
            String storage=symbols[random.nextInt(symbols.length)];
            PassSave += storage;
         }
      //updates to check on while
      Gpass=PassSave;
      }
      System.out.println(Gpass);
   }
}