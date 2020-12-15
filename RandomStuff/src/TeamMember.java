public class TeamMember extends Empolyee
{

  private int numberOfProjects;

  public TeamMember(String name, int empolyeeID, int numberOfProjects)
  {
    super(name, empolyeeID);
    this.numberOfProjects = numberOfProjects;
  }
}
