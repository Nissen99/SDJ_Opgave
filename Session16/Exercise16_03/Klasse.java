import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Klasse
{
  public static void main(String[] args)
  {
    StudentList list = new StudentList();

    try
    {
      Scanner in = new Scanner(new File("C:\\Users\\mikke\\IdeaProjects\\SDJ_Opgave\\Session16\\Exercise16_03\\Students.txt"));

        String s;

      while (in.hasNext()){

        s = in.nextLine();

        String[] split = s.split(", ");

    Student other = new Student(split[2], Integer.parseInt(split[1]), split[3], Integer.parseInt(split[0]), new MyDate(Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6])));
    list.add(other);

      }
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    System.out.println(list);

  }
}
