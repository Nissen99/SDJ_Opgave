public class Junior extends ClubMember
{
  private char gender;

  public Junior(String name, int age, char gender)
  {
    super(name, age);
    this.gender = gender;
  }

  public char getGender()
  {
    return gender;
  }

  public String toString(){
    return toString() + " Gender is: " + gender;
  }

  public double getMembershipFee(){
    double boysFee = 400;
    double girlsFee = 300;
    if (gender == 'b'){
      return boysFee;
    }
    else if (gender == 'g'){
      return girlsFee;
    }
  else{
    return -1;
    }
  }
}
