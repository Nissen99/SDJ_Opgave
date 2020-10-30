public class ToyTest
{
  public static void main(String[] args)
  {

    Football other = new Football(13,54);
    Football other2 = new Football(13,524);
    Football other3 = new Football(13,534);
    Handball other4 = new Handball(13,4);
    Lego other5 = new Lego(23, 21312);

    Toy[] toys = new Toy[5];

    toys[0] = other;
    toys[1] = other2;

    toys[2] = other3;

    toys[3] = other4;

    toys[4] = other5;



    for (int i = 0; i < toys.length; i++){
      System.out.println(toys[i].play());
    }



  }
}
