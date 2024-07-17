package hierarchicalInheritance.cricket;
// child class -1

public class Batsman1 extends CricketPlayer {
	int over;
	int runs;
	public void batsmanDetails(int over,int runs)
	{
		this.over=over;
		this.runs=runs;
		
	
		System.out.println("Over: "+over);
		System.out.println("Run: "+runs);
	}

	public static void main(String[] args) {
		Batsman1 obj1=new Batsman1();
		obj1.player("virat Koli");
		obj1.batsmanDetails(10,200);

	}

}
