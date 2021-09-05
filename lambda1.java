package assgn8;

@FunctionalInterface
interface Inter
{
	
	public abstract int operations(int r,int q);
}

public class lambda1 {

	public static void main(String[] args) {
	 Inter a1=(r,q) -> r+q;
	 System.out.println("Addition: "+a1.operations(5, 4));
	 
	 Inter a2=(r,q) -> r-q;
	 System.out.println("Subtraction: "+a2.operations(5, 4));
	 
	 Inter a3=(r,q) -> r*q;
	 System.out.println("Muliplication: "+a3.operations(5, 4));
	 
	 Inter a4=(r,q) -> r/q;
	 System.out.println("Division: "+a4.operations(5, 4));




	}

}
