import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreStuff
{
  public static void main(String[] args)
  {

    Junior mikkel = new Junior("Mikkel", 20, 'b');
    Junior mark = new Junior("Mark", 21, 'g');

    OldBoys bastian = new OldBoys("bastian", 35, 7);
    OldBoys antonio = new OldBoys("Antonio", 78, 2);
    OldBoys karsten = new OldBoys("Karsten", 17, 14);

    Senior astrid = new Senior("Astrid", 29);

    ArrayList<ClubMember> members = new ArrayList<>();

    members.add(mikkel);
    members.add(mark);
    members.add(bastian);
    members.add(antonio);
    members.add(karsten);
    members.add(astrid);



    File file = new File("Kiks.txt");
    PrintWriter out = null;

    try
    {
    out = new PrintWriter(file);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    for (int i = 0; i < members.size(); i++)
    {
      out.println(members.get(i).getName());
      out.flush();
    }



    Scanner scanner = null;
    try
    {
     scanner = new Scanner(file);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }


while (scanner.hasNext())   {
      System.out.println(scanner.nextLine());
    }

  }
}
