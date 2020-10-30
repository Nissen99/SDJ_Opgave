public class Senior extends ClubMember
{

  public Senior(String name, int age)
  {
    super(name, age);
  }

  public double getMembershipFee(){
    return 10 * (100-getAge());
  }
}
