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
try
{
  System.out.println("Please input an integer");
  list.add(scanner.nextInt());
} catch (InputMismatchException e){
  if (scanner.nextLine().equals("end")){
    break;
  }
}
    } while (true);

    for (int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }

  }
}
