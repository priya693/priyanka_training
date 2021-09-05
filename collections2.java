package assgn6;

import java.util.*;

public class collections2 {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          
          HashSet<String> u=new HashSet<String>();
          
          for(int counter=1; counter<=10; counter++)
          {
        	  System.out.println("Product Object "+counter+" : ");
        	  String product=sc.nextLine();
        	  u.add(product);
          }
          
          System.out.println(u);
          sc.close();

	}

}
