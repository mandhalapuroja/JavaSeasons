package sep21st;

public class InheritDemo1 {

	public static void main(String[] args) {
		
		//Student s1=new Student();
		
		Marks s1=new Marks();
		
		s1.setDetails(1, "Ravi");
		s1.getDetails();
		s1.setMarks(70, 80, 70);
		s1.getResults();
		
	}

}
