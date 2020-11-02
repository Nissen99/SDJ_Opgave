import java.util.InputMismatchException;
import java.util.Scanner;

public class IntTest
{
  public static void main(String[] args)
  {

    int[] list = new int[5];
    Scanner input = new Scanner(System.in);

    for (int i =0 ;i < list.length;){


      try
      {
        System.out.println("Type and int plz");

        int other = input.nextInt();

        if (other < 99 && other > 10)
        {

          list[i] = other;
          System.out.println("Hat");
          i++;
        }
      }

   catch (InputMismatchException e){
     System.out.println("The input is not an integer in the range 10-99, try again");
input.next();
   }
  }
    System.out.println(list);
  }}
