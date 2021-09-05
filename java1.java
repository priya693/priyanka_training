package assgn10;

interface Inter
{
	public abstract int SI(int a,int b,int c);
}
public class java1 {

	public static void main(String[] args) {
		Inter i=(a,b,c)->(a*b*c)/100;
		System.out.println(i.SI(3500, 4, 8));

	}

}
