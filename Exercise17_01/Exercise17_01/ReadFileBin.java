import java.io.*;
import java.util.Scanner;

public class ReadFileBin
{
  public static void main(String[] args)
      throws IOException, ClassNotFoundException
  {



    File file = new File("C:/Users/mikke/IdeaProjects/SDJ_Opgave/Kik.bin");


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


while(true)
{
  try{
  System.out.println(in.readObject());
}catch (EOFException e){
  }
}


  }
}
