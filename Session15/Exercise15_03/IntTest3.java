import java.util.InputMismatchException;
import java.util.Scanner;

public class IntTest3
{
  public static void main(String[] args)
  {
    int[] listOfInts;
    Scanner scanner = new Scanner(System.in);

   while (true)
   {
     try {
     System.out.println("How big do you want your list");
     listOfInts = new int[scanner.nextInt()];
     break;
   }catch (InputMismatchException e){
       System.out.println("A NUMBER, how hard can it be");
       scanner.nextLine();
     }

   }

    for (int i = 0; i < listOfInts.length; )
    {

      try
      {
        System.out.println("Please input an integer");
        listOfInts[i] = scanner.nextInt();
        i++;

      }
      catch (InputMismatchException e)
      {
        scanner.next();
        System.out.println("Try again");

      }
    }

    for (int i = 0; i < listOfInts.length; i++)
    {
      System.out.println(listOfInts[i]);
    }


    int firstNumber = 0;

    int secondNumber = 0;


    while (firstNumber==0 || secondNumber==0){
      int other = 0;
      try
      {
        System.out.println("Chose 1 ints from the list");
        other = scanner.nextInt();
      }catch (InputMismatchException e){
        System.out.println("try again");
        scanner.nextLine();
      }


      for (int i = 0; i < listOfInts.length;i++){

        if (other == listOfInts[i]){
          if (firstNumber == 0){
            firstNumber = other;
          }

          else {
            secondNumber = other;
          }
        }


      }

    }



scanner.nextLine();
    boolean repeat = true;
  do
    {
      repeat = false;

      System.out.println("What math you want me g?");
      String math = scanner.nextLine();

      switch (math)
      {
        case "add":
          System.out.println(firstNumber + secondNumber);
          break;

        case "minus":
          System.out.println(firstNumber-secondNumber);
          break;

        case "times":
          System.out.println(firstNumber*secondNumber);
          break;

        case "divide":
          System.out.println("This does not work well with ints cuz they are ints");
          System.out.println(firstNumber/secondNumber);
          double firstDouble = firstNumber;
          double secondDouble = secondNumber;
          System.out.println("This works better with doubles");
          System.out.println(firstDouble/secondDouble);
          break;

        default:
          System.out.println("Try again");
          repeat = true;
          break;


      }
    } while (repeat);





  }
}
