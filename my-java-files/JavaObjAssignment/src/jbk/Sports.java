package jbk;

public class Sports {
	String sportname;
	String teamname;
	String sportype;
	String coachname;
	int numPlayers;
	String homecity;
	int championshipwon;
	
	

	public static void main(String[] args) {
		Sports sp1=new Sports();
		
		System.out.println(sp1.sportname="cricket");
		System.out.println(sp1.teamname="MI");
		System.out.println(sp1.sportype="outdoor");
		System.out.println(sp1.coachname="pollard");
		System.out.println(sp1.numPlayers=11);
		System.out.println(sp1.homecity="bhosari");
		System.out.println(sp1.championshipwon=5);
		
	    System.out.println( "--------------------------------------------");
		
		Sports sp2=new Sports();
		
		System.out.println(sp2.sportname="kabaddi");
		System.out.println(sp2.teamname="csk");
		System.out.println(sp2.sportype="outdoor");
		System.out.println(sp2.coachname="bravo");
		System.out.println(sp2.numPlayers=11);
		System.out.println(sp2.homecity="mumbai");
		System.out.println(sp2.championshipwon=5);
		
		

	}

}
