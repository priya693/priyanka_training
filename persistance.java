package assgn2;

import java.util.Scanner;

abstract class persistence {
	abstract void persist();
}

class filepersistence extends persistence {
	void persist() {
		System.out.println("file persistence");
	}
}

class databasepersistence extends persistence {
	void persist() {
		System.out.println("database persistence");
	}
}
public class persistance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("data is saved in(select either file or database):");
		String s=sc.nextLine();
		filepersistence f=new filepersistence();
		databasepersistence d=new databasepersistence();
		if(s.contentEquals("file")) {
			f.persist();			
		}
		else {
			d.persist();
		}
		sc.close();
	

	}

}
