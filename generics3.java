package assgn5;

public class generics3 {

	public static void main(String[] args) {
		Integer Array[]= {0,1,2,3,4,5};
		Place s=new Place();
		s.swap(Array,2,4);
		

	}
	static class Place {
		<T> void swap(T[] Array,int place1,int place2) 
		{
			          T temp=Array[place1];
			          Array[place1]=Array[place2];
			          Array[place2]=temp;
			          
			          for(T integer : Array) {
			        	  System.out.println(integer+" ");
			          }
		}
	}

}
