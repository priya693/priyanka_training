package assgn8;

public class lambda8 {

	public static void main(String[] args) {
		Thread q=new Thread();
		q.start();
		
		for(int i=0;i<=2;i++)
		{
			Consumer<Integer> c=s->System.out.println(s);
		    c.accept(1);
		    c.accept(2);
			c.accept(3);
			
		}
	}

}
