import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter
{
  public static void main(String[] args) throws FileNotFoundException
  {

    Scanner in = new Scanner(new File("C:/Users/mikke/IdeaProjects/SDJ_Opgave/friends.txt"));

    while (in.hasNext())
    {
      System.out.println(in.nextLine());
    }

    in.close();








//
//    try
//    {
//     PrintWriter out = new PrintWriter(file);
//     out.println(1);
//     out.println(2);
//     out.println(3);
//     out.println(4);
//     out.println(5);
//     out.close();
//    }
//    catch (FileNotFoundException e)
//    {
//      e.printStackTrace();
//    }
//



  }
}
