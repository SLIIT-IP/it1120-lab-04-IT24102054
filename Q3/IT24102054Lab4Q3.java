import java.util.Scanner;
public class IT24102054Lab4Q3{
  public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    System.out.print("enter a number : ");
    int number =input.nextInt();

    String result = (number > 0 )? "positive":
                 (number < 0 )? "negative":
                 "zero";


    System.out.println("The number is : " + result);
   
  }
}

    

    