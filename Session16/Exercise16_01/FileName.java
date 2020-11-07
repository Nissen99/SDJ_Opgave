import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileName
{
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the name of the file");
    String name = scanner.nextLine();
    File file = new File(name + ".txt");

    PrintWriter out = new PrintWriter(file);


    while(true){

      try{

        System.out.println("Write the name of a friend");
        String other = "";
        other += scanner.nextLine();


        if (!other.equals("QUIT"))
        {
          out.println(other);
          out.flush();
        }
        else{
          break;
        }


      }catch (InputMismatchException e){
        System.out.println("WRONG");

      }


    }















  }

}
