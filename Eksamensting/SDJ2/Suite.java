public class Suite extends Room
{
  private int noOfRooms;

  public Suite( int noOfRooms, int number)
  {
    super(number, "kingsize");
    this.noOfRooms = noOfRooms;
  }

  @Override
  public double getPrice(){

    double priceTowSuite = 120.00;
    double priceThreeSuite = 160.00;

    if (noOfRooms==2){
    return priceTowSuite;
  }
  else if (noOfRooms==3){
    return priceThreeSuite;
    }

  else{
    return priceThreeSuite + 30 * (noOfRooms - 3);
    }
  }


  public int getNumberOfRooms(){
    return noOfRooms;
  }
}
