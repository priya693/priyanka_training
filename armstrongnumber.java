package assgn;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,r,s=0;
		for(int i=100;i<=999;i++)
		{
			s=0;
			n=i;
			while(n>0)
			{
				r=n%10;
				s=s+(r*r*r);
				n=n/10;
			}
			if(s==i)
			{
				System.out.println(i);
			}
		}

	}

}

