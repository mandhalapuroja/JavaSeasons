package sep14th;

public class PersonDemo {

	public static void main(String[] args) {
		
		//using new operator
		
		Person p1=new Person();
		
		 System.out.println(p1.name);
		 System.out.println(p1.age);
		 System.out.println(p1.phone);
		 
		 p1.greet();
		 
		 p1.name="john";
		 p1.age=30;
		 p1.phone=9988099880l;
		 
		 System.out.println(p1.name);
		 System.out.println(p1.age);
		 System.out.println(p1.phone);
		 
		 p1.greet();
		
		
		
		
		
	}

}
