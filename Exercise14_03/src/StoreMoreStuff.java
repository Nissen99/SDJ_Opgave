import java.io.*;
import java.util.ArrayList;

public class StoreMoreStuff
{
  public static void main(String[] args)
      throws IOException, ClassNotFoundException
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

    File file = new File("Kiks.bin");


    FileOutputStream fot = null;


    fot = new FileOutputStream(file);






ObjectOutputStream out = null;



out = new ObjectOutputStream(fot);

    for (int i = 0; i < members.size(); i++)
    {
      out.writeObject(members.get(i));
    }








    FileInputStream fis = null;
    try
    {
fis = new FileInputStream(file);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }


    ObjectInputStream in = null;
    try
    {
in = new ObjectInputStream(fis);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }


    while (true)
      try
      {
        System.out.println(in.readObject());

      }catch (Exception e){
        break;
      }



  }
}
