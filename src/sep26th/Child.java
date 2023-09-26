package sep26th;

public class Child extends Parent{
	
	int x;
	
	public void putX(int x)
	{
		this.x=x;
	}
	
	public void showAll()
	{
		System.out.println(super.x);
		System.out.println(x);
		System.out.println(y);
	}

	public void greet(String name)
	{
		super.greet(name);
		System.out.println("Hey "+name+"..whazaap ???");
	}
}
