public class Bed
{
  private String type;

  public Bed(String type)
  {
    this.type = type;
  }


  public boolean isSingle(){

    String typeHolder = type;
    if (typeHolder.toLowerCase().equals("single")){
      return true;
    }
    else{
      return false;
    }
  }



  public boolean isKingSize(){

    String typeHolder = type;
    if (typeHolder.toLowerCase().equals("kingsize")){
      return true;
    }
    else{
      return false;
    }
  }


  public boolean isDouble(){

    String typeHolder = type;
    if (typeHolder.toLowerCase().equals("double")){
      return true;
    }
    else{
      return false;
    }
  }









}
