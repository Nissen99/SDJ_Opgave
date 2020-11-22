import java.io.Serializable;

public abstract class ClubMember implements Serializable
{
  private String name;
  private int age;

  public ClubMember(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String toString(){
    return "The name is: " + name + " The age is: " + age;
  }

  public abstract double getMembershipFee();

}
