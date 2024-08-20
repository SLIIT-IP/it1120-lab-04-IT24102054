import java.util.Scanner;

public class IT24102054Lab4Q2 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("enter exam marks :");
      exammarks = input.nextdouble();

      if (exammarks <= 0 && exammarks >= 100) {
         System.out.println("Invalid input for exam marks ");
      } else

         System.out.println("enter lab submission marks :");
      labmarks = input.nextdouble();
      if (labmarks >= 0 && labmarks <= 0) {
         System.out.println("Invalid input for lab marks ");
      }

      System.out.println("please enter the percentage given for the exam");
      markpercentage = input.nextdouble();

      System.out.println("please enter the percentage given for the lab submission :");
      labpercentage = input.nextdouble();
      if (markpercentage + labpercentage != 100)
         System.out.println("the percentages must add up to 100, terminating programe");
      else {
         total = (exammarks * markpercentage / 100) + (labmarks * labpercentage / 100);
         System.out.println("final EXam Mark is : " + total);
      }

   }

}
