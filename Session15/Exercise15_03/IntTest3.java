import java.util.InputMismatchException;
import java.util.Scanner;

public class IntTest3
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);

    System.out.println("How big do you want your list");
    int[] listOfInts = new int[scanner.nextInt()];



    for (int i = 0; i < listOfInts.length;){

      try
      {
        System.out.println("Please input an integer");
        listOfInts[i] = scanner.nextInt();
        i++;

      } catch (InputMismatchException e){
       scanner.next();
       System.out.println("Try again");

      }
    }

    for (int i = 0; i < listOfInts.length; i++)
    {
      System.out.println(listOfInts[i]);
    }

    System.out.println("Chose 2 ints from the list");

    int firstNumber = scanner.nextInt();

    int secondNumber = scanner.nextInt();


    for (int i = 0; i < listOfInts.length; i++){

      if (firstNumber == listOfInts[i]){
        continue;
      }
      else if (i == listOfInts.length -1){

      }
    }





  }
}
