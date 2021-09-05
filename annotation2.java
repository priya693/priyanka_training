package assgn7;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

@interface info
{
	int authorID();
	String Date();
	String Time();
	int version();
}

@info(authorID=8899,Date="23-10-2000",Time="12:30",version=4)
class information 
{
	String name;
	String supervisor;
	String desc;
	
	information(String name,String supervisor,String desc)
	{
		this.name=name;
		this.supervisor=supervisor;
		this.desc=desc;
		
	}
}

public class annotation2 {

	public static void main(String[] args) {
		information i=new information("author Name: Aman","supervisor:dheer","information of author");
		System.out.println(i.name+" "+i.supervisor+" "+i.desc);
		
		Class c=i.getClass();
		Annotation a=c.getAnnotation(info.class);
		info g=(info)a;
		
		System.out.println(g.Date()+" "+g.Time()+" "+g.authorID()+" "+g.version());

	}

}
