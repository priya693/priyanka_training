package assgn6;

import java.util.*;
import java.time.LocalDate;

public class collections4 {

	public static void main(String[] args) {
			LocalDate d1=LocalDate.of(1998, 8, 20);
			LocalDate d2=LocalDate.of(1997, 10, 10);
			LocalDate d3=LocalDate.of(2004, 12, 26);
			LocalDate d4=LocalDate.of(2002, 9, 8);
			
			LinkedList<Object> o=new LinkedList<Object>();
			o.add(d1);
			o.add(d2);
			o.add(d3);
			o.add(d4);
			
			for(Object i:o) {
				int j=((LocalDate) i).getYear();
				
				if(((j%4==0) && (j%100!=0)) || (j%400==0))
					System.out.println("Your Date of Birth : "+((LocalDate)i)+" It is a Leap year.");
					else
						System.out.println("Your Date of Birth : "+((LocalDate)i)+" It is not  a Leap year.");
						
			}


	}

}
