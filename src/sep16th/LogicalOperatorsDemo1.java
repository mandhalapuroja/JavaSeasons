package sep16th;

import java.util.Scanner;

public class LogicalOperatorsDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter some value for x ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		if(x>0 && x<10)
		{
			System.out.println("x is between 0 and 10");
		}
		else
		{
			System.out.println("x is not in the range");
		}

	}

}
