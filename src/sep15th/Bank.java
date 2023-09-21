package sep15th;

public class Bank {
	
	private double balance  = 10000;
	
	
	//getter
	
	public double getBalance(int pin)
	{
		//validation 
		
		if(pin == 3421)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid pin entered ...");
			return 0.0;
		}
	}
	
	//setter 
	
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}

}
