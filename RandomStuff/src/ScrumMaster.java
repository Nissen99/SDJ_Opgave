public class ScrumMaster extends TeamMember
{


  private String hoesName;

  public ScrumMaster(String name, int empolyeeID, int numberOfProjects, String hoesName)
  {
    super(name, empolyeeID, numberOfProjects);
    this.hoesName = hoesName;
  }


  public String getHoesName(){
    return hoesName;
  }

  public String toString(){
    return getName() + " " + hoesName;
  }
}
