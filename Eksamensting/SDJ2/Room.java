public class Room
{
  private int number;
  private Guest guest;
  private Bed bed;

  public Room(int number, String bedType)
  {
    this.number = number;
    bed = new Bed(bedType);
  }


  public int getNumber(){
    return number;
  }

  public int getFloor(){
    return number/100;
  }

  public double getPrice(){

    double priceSingle = 59.50;
    double priceDouble = 72.40;
    double priceKingSize = 89.00;

    if (bed.isSingle()){
      return priceSingle;
    }
    else if (bed.isDouble()){
      return priceDouble;
    }
    else if (bed.isKingSize()){
      return priceKingSize;
    }
    else {
      return 0;
    }
  }


  public boolean isOccupied(){
    if (guest==null){
      return false;
    }
    else{
      return true;
    }
  }

  public void registerGuest(Guest guest){
    if (this.guest == null)
    {
      this.guest = guest;
    }
  }

  public void vacate(){
    this.guest = null;
  }

  public String getBedType(){

    if (bed.isSingle()){
      return "Single";
    }
    else if (bed.isDouble()){
      return "Double";
    }
    else if (bed.isKingSize()){
      return "KingSize";
    }
    else return null;
  }

  public Guest getGuest(){
    return guest;
  }
  }
