import org.w3c.dom.ls.LSOutput;

public class HouseTest
{

  public static void main(String[] args)
  {


    Apartment other = new Apartment("Yikes", 3191);
    Apartment other2 = new Apartment("Yikes", 3191);
    House other3 = new House("Yikes", 3191);
    Person mikkel = new Person("Mikkel", new Apartment("kollegievænget", 3191));
    Person mark = new Person("Mark", new Apartment("kollegieet", 3221));
    Person bastian = new Person("Mikkel", new House("vægtenskvarter", 3190000));


    Person mikkels = new Person("Mikkel", new Apartment("kollegievænget", 3191));

    Person[] persons = new Person[3];
  persons[0] = mikkel;
  persons[1] = mark;
  persons[2] = bastian;


  for (int i = 0; i < persons.length; i++){
    System.out.println(persons[i].getHomeInfo());
  }

    System.out.println(mikkel.equals(mikkels));
    System.out.println(other3.equals(other3));
    System.out.println(other2.equals(other));
    System.out.println(other.equals(other3));





  }



}
