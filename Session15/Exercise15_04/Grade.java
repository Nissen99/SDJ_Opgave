public class Grade
{
  private String courseName;
  private int grade;

  public Grade(String courseName, int grade)
  {
    try
    {
      this.courseName = courseName;
      this.grade = grade;
    } catch (IllegalArgumentException e){
      System.out.println("Do some good shit");
    }
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getGrade()
  {
    return grade;
  }



  public void setGrade(int grade)
  {
    try{
    this.grade = grade;
  }catch (IllegalArgumentException e){
      System.out.println("Do some good shit");
    }
  }


  public String toString(){
    return "Course is: " + courseName + "and the grade is: " + grade;
  }


  public boolean isLegalGrade(int grade){

    switch (grade){

      case -3:
        return true;



      case 0:
        return true;

      case 2:
        return true;

      case 4:
        return true;

      case 7:
        return true;


      case 10:
        return true;

      case 12:
        return true;

      default:
        return false;
    }
  }




}
