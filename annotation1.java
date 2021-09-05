package assgn7;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Test
{
	String type();	
}

class TestCase
{
	@ Test (type="testcase")
	public void methodType()
	{
		System.out.println("This is testcase method");
	}
}

public class annotation1 {

	public static void main(String[] args) {
			TestCase e=new TestCase();
			e.methodType();
			
			Class a=e.getClass();
			Annotation t=a.getAnnotation(Test.class);
			
			Test s=(Test) t;
			System.out.println(s.type());
			
		}

	}


