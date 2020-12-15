import java.util.Date;
import java.util.Scanner;

public class PCGuessNr
{
  public static void main(String[] args)
  {

    int lowerBound = 0;
    int max = 1024;
    int holder = 0, other;
    Scanner scanner = new Scanner(System.in);

    while (true)
    {


      int upperBound = max - lowerBound;
      other = (int) (Math.random() * upperBound + lowerBound);

      System.out.println(other);
      holder = scanner.nextInt();

      if (holder==1){
lowerBound = other+1;
      }
      else if (holder==2){
        max=other;
      }
      else{
        break;
      }
      
    } System.out.println("It was right " + other);

  }
}
