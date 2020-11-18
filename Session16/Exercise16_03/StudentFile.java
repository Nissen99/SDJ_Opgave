import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;

public class StudentFile
{
  private File file;

  public StudentFile(String filename)
  {
    setFile(filename);
  }

  public void setFile(String filename)
  {
    file = new File(filename);
  }

  public File getFile()
  {
    return file;
  }

  public StudentList readTextFile() throws FileNotFoundException
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

    finally
    {
    //Aner ikke hvad den her skal

    }


    return list;
  }

  public StudentList readTextFile(String filename)
      throws FileNotFoundException, ParseException
  {
    setFile(filename);
    return readTextFile();
  }

  public void writeTextFile(StudentList students)
      throws FileNotFoundException
  {

    File file = new File("students.txt");
    PrintWriter out = new PrintWriter(file);

    //Format er, navn, student nr, date, nation, group

    for (int i = 0; i < students.size(); i++)
    {

      out.println(students.get(i).getGroupNumber()+ ", "
      +  students.get(i).getStudyNumber() + ", "
      + students.get(i).getName() + ", "
      + students.get(i).getNationality() + ", "
      + students.get(i).getBirthday().getDay() + ", "
      + students.get(i).getBirthday().getMonth()+ ", "
      + students.get(i).getBirthday().getYear());


    }






  }

  public void writeTextFile(StudentList students, String filename)
      throws FileNotFoundException
  {
    setFile(filename);
    writeTextFile(students);
  }

  public void writeBinaryFile(StudentList list) throws IOException
  {
    // TODO: Implement this method
  }

  public void writeBinaryFile(StudentList list, String filename)
      throws IOException
  {
    setFile(filename);
    writeBinaryFile(list);
  }

  public StudentList readBinaryFile() throws IOException,
      ClassNotFoundException
  {
    // TODO: Implement this method
    return null;
  }

  public StudentList readBinaryFile(String filename) throws IOException,
      ClassNotFoundException
  {
    setFile(filename);
    return readBinaryFile();
  }

}
