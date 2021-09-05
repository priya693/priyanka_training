package assgn2;

class shape{
	void draw()
	{
		System.out.println("draw the shape");
	}
}
class line {
	void draw()
	{
		System.out.println("--------");
	}
}

class square {
	void draw()
	{
		System.out.println("-------");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("--------");
	}
}
 
class rectangle {
	void draw()
	{
		System.out.println("-------");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("--------");
	}
}

class cube {
	void draw()
	{
		System.out.println("cube");
	}
}

public class shapes {

	public static void main(String[] args) {
		line l = new line();
		square sq = new square();
		rectangle rec = new rectangle();
		cube c = new cube();
		l.draw();
		sq.draw();
		rec.draw();
		c.draw();
		

	}

}
