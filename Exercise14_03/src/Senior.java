import java.io.Serializable;

public class Senior extends ClubMember implements Serializable
{

  public Senior(String name, int age)
  {
    super(name, age);
  }

  public double getMembershipFee(){
    return 10 * (100-getAge());
  }
}
