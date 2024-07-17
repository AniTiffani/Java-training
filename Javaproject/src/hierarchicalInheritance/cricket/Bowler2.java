package hierarchicalInheritance.cricket;
// child class - 2
public class Bowler2 extends CricketPlayer {
	int wicket;
	public void bowlerDetails(int wicket)
	{
		this.wicket=wicket;
	
		System.out.println("All Out: "+wicket);
	}

	public static void main(String[] args) {
		Bowler2 obj2=new Bowler2();
		obj2.player("Virat koli");
		obj2.bowlerDetails(10);

	}

}
