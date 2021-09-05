package assgn8;

import java.util.*;

interface Predicate<U>
{
	public boolean test(U t);
}

interface Function<U,R>
{
	public R apply(U t);
}

interface Consumer<U>
{
	public void accept(U t);
}

interface Supplier<R>
{
	public R get();
}
public class lambda3 {

	public static void main(String[] args) {
		Predicate<Integer> p=q->q%2==0;
		System.out.println(p.test(20));
		
		Function<Integer,Integer> s=q->q*q;
		System.out.println(p.test(20));
		
		Consumer<String> y=o->System.out.println(o);
		y.accept("Aman");
				
	    Supplier<Date> h=() ->new Date();
	    System.out.println(h.get());		
	}

}
