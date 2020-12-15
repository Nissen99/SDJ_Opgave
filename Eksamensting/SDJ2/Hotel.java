import java.util.ArrayList;

public class Hotel
{
  private String name;
  private Room[] rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {

    int counter = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (!(rooms[i].isOccupied()))
      {
        counter++;
      }

    }
return counter;
  }

  public Room getFirstAvailableRoom(){

    for (int i = 0; i < rooms.length; i++)
    {
      if (!(rooms[i].isOccupied())){
        return rooms[i];
      }
    }
    return null;
  }


  public Room getFirstAvailableRoom(double maxPrice){

    for (int i = 0; i < rooms.length; i++)
    {

      if (rooms[i].getPrice() <= maxPrice){
        return rooms[i];
      }
    }
    return null;
  }

  public Room[] getAllAvailableRooms(String bedType){

    ArrayList<Room> other = new ArrayList<>();


    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].getBedType().equals(bedType)){
        other.add(rooms[i]);
      }
    }
    Room[] other2 = new Room[other.size()];
    for (int i = 0; i < other.size(); i++)
    {
      other2[i] = other.get(i);
    }
    return other2;
  }

  public boolean hasGuest(Guest guest){

    for (int i = 0; i < rooms.length; i++)
    {
      if (guest.equals(rooms[i].getGuest())){
        return true;
      } }
    return false;
  }


  public Room getRoom(Guest guest){

    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].getGuest().equals(guest)){
        return rooms[i];
      }
    }
    return null;
  }

}