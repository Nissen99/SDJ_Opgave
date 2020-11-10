import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;
  private int indexOfNextAvailableElement;

  public GradeList(ArrayList<Grade> grades)
  {
   grades = new ArrayList<>();
  }

  public int getSize(){
    return grades.size();
  }

  public Grade getGrade(int index){
    return grades.get(index);
  }

  public void addGrade(Grade grade){
    grades.add(grade);
  }

  public Grade[] getAllGrades(){
    Grade[] other = new Grade[grades.size()];

    for (int i = 0; i < grades.size(); i++){

      other[i]=grades.get(i);
    }
    return other;

  }


  public double getAverage(){
    double average;
    double sum = 0;
    for (int i = 0; i < grades.size(); i++){
      sum += grades.get(i).getGrade();
    }
    average = sum/grades.size();
    return average;
  }

  public String toString(){
String other = "";
    for (int i = 0; i < grades.size(); i++)
    {
      other += grades.get(i).toString() + "\n";
    }
    return other;
  }


}
