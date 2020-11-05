import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestInt2
{
  public static void main(String[] args)
  {

    ArrayList<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int sum = 0;


    do
    {
try
{
  System.out.println("Please input an integer");
  list.add(scanner.nextInt());
  counter++;
  sum += list.get(list.size()-1);
} catch (InputMismatchException e){
  if (scanner.nextLine().equals("end")){
    break;
  }
  else{
    System.out.println("Try again");
  }
}
    } while (true);

    System.out.println("You input " + counter + " int and they sum " + sum);
  }
}
