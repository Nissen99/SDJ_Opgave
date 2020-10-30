public class House extends Home
{
  private double price;

  public House(String address, double price)
  {
    super(address);
    this.price = price;
  }

    public String getInfo(){
    return "The address is: " + getAddress() + " And the price is: " + price;
  }

  public boolean equals(Object obj){

    if (!(obj instanceof House)){
      return false;
    }

    House other = (House) obj;

    return other.getInfo().equals(getInfo());
  }


  public String toString(){
    return "Price: " + price + " Address: " + getAddress();
  }



}
