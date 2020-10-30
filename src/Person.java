public class Person
{
  private String name;
  private Home home;

  public Person(String name, Home home)
  {
    this.name = name;
    this.home = home;
  }

  public String getHomeInfo(){
    return home.getInfo();
  }

  public String toString(){
    return "The name is: " + name + " The home is " + home.toString();
  }

  public boolean equals(Object obj){

    if (!(obj instanceof Person)){
      return false;
    }

    Person other = (Person) obj;

    return other.getHomeInfo().equals(getHomeInfo()) && other.name.equals(name);
  }
}
