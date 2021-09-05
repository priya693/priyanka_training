package assgn8;
import java.util.*;
import java.util.function.Predicate;

class Orders
{
	int price;
	String status;
	
	Orders(int price,String status)
	{
		this.price=price;
		this.status=status;
	}
	
	public String toString()
	{
		return "Order: "+status+"  bill: "+price;
	}
}

public class lambda2 {

	public static void main(String[] args) {
		ArrayList<Orders> l=new ArrayList<Orders>();
		l.add(new Orders(11000,"ACCEPTED"));
		l.add(new Orders(5000,"ACCEPTED"));
		l.add(new Orders(21000,"NOT ACCEPTED"));
		
		Predicate<Orders> p=(Orders o) ->((o.price>10000) && (o.status.equals("ACCEPTED")));
		
		for(Orders o1:l){
			{
				if(p.test(o1))
				 {
					System.out.println("Order : "+o1.status+" price : "+o1.price);
				}
			}
		}
}
}

