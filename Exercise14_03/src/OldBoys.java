public class OldBoys extends ClubMember
{
  private int yearsOfMembership;

  public OldBoys(String name, int age, int yearsOfMembership)
  {
    super(name, age);
    this.yearsOfMembership = yearsOfMembership;
  }

  public int getYearsOfMembership()
  {
    return yearsOfMembership;
  }

  public void setYearsOfMembership(int yearsOfMembership)
  {
    this.yearsOfMembership = yearsOfMembership;
  }

  public String toString(){
    return toString() + " Years of membership: " + yearsOfMembership;
  }

  public double getMembershipFee(){

  if (yearsOfMembership < 5){
    return 300;
  }
  else if(5 <= yearsOfMembership && yearsOfMembership <= 9){
    return 200;
  }
  else if (yearsOfMembership > 9){
    return 100;
  }
    else {
      return -1;
  }
  }

}
