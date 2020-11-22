import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileName
{
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the name of the file");
    String name = scanner.nextLine();
    File file = new File(name + ".bin");
    FileOutputStream fis = new FileOutputStream(file);
    ObjectOutputStream out = null;
    try
    {
      out = new ObjectOutputStream(fis);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }


    while(true){

      try{

        System.out.println("Write the name of a friend");
        String other = scanner.nextLine();


        if (!other.equals("QUIT"))
        {
          out.writeObject(other);
        }
        else{
          break;
        }


      }catch (InputMismatchException | IOException e){
        System.out.println("WRONG");

      }



    }
  }
}
