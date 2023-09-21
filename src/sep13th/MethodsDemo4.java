package sep13th;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		System.out.println(MethodsDemo4.natSum(5));
		
		System.out.println(MethodsDemo4.natSum(10));
		
		System.out.println(MethodsDemo4.natSum(100));
		
		System.out.println(MethodsDemo4.natSum(1000));
		
	}

	public static int natSum(int n)
	{
		int res=n*(n+1)/2;
		
		return res;
	}
}
