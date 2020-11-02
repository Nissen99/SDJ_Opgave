import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestInt2
{
  public static void main(String[] args)
  {

    ArrayList<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    do
    {

        System.out.println("Please input an integer");
        list.add(scanner.nextInt());




    } while (true);



  }
}
