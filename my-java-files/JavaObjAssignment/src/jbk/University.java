package jbk;

public class University {
	String UniName;
	String loc;
	int numstudents;
	int numprofessor;
	int ranking;
	String Dep;
	int grdlevel;
	
	public static void main(String[] args) {	
		
		
		University u1= new University();
		University u2= new University();
		
		System.out.println(u1.UniName ="SPPU" );
		System.out.println(u1.loc ="Pune" );
		System.out.println(u1.numstudents = 400  );
		System.out.println(u1.numprofessor = 10 );
		System.out.println(u1.ranking = 001 );
		System.out.println(u1.Dep = "Computer" );
		System.out.println(u1.grdlevel = 4 );
		
		
		System.out.println("----------------69----------------------" );
		

		System.out.println(u2.UniName ="SPPU2" );
		System.out.println(u2.loc ="bhosari" );
		System.out.println(u2.numstudents = 402 );
		System.out.println(u2.numprofessor = 11 );
		System.out.println(u2.ranking = 45 );
		System.out.println(u2.Dep = "aids" );
		System.out.println(u2.grdlevel = 6 );
	}

}
