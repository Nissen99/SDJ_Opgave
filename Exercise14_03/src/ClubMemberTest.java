import java.util.ArrayList;

public class ClubMemberTest
{
  public static void main(String[] args)
  {

    Junior mikkel = new Junior("Mikkel", 20, 'b');
    Junior mark = new Junior("Mark", 21, 'g');

    OldBoys bastian = new OldBoys("bastian", 35, 7);
    OldBoys antonio = new OldBoys("Antonio", 78, 2);
    OldBoys karsten = new OldBoys("Karsten", 17, 14);

  Senior astrid = new Senior("Astrid", 29);

    ArrayList<ClubMember> members = new ArrayList<>();

    members.add(mikkel);
    members.add(mark);
    members.add(bastian);
    members.add(antonio);
    members.add(karsten);
    members.add(astrid);

    for (int i = 0; i < members.size(); i++){
      System.out.println(members.get(i).getMembershipFee());
    }








  }
}
