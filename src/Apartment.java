public class Apartment extends Home
{

  private double rent;

  public Apartment(String address, double rent)
  {
    super(address);
    this.rent = rent;
  }

  public String getInfo(){
    return "The address is: " + getAddress() + " The rent is: " + rent;
  }

  public boolean equals(Object obj){

    if (!(obj instanceof Apartment)){
      return false;
    }
    Apartment other = (Apartment) obj;

    return other.getInfo().equals(getInfo());
  }

  public String toString(){
    return "Rent: " + rent + " Address: " + getAddress();
  }
}
