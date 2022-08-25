
public  class Bank { // super class
	
	public void withdraw(int i)  // method overloading
	{
		System.out.println("withdraw-money");
		System.out.println(i);
	}
	public void deposit(float j) // method overloading
	{
	System.out.println("deposit-money");
	System.out.println(j);
	}
	public void loan()
	{
		
	}
	public static void main(String[] args) {
	
      Sbi s = new Sbi();  // creating object to Sbi class
      s.loan();
      s.withdraw(5000); //method calling
      s.deposit(8000);
      Hdfc h = new Hdfc(); // creating object to Hdfc class
      h.loan();
      h.withdraw(2000);
      h.deposit(6000);
	}

}
class Sbi extends Bank // sub class , inheritance
{
	public void loan()
	{
		System.out.println("SBI BANK DETAILS");
		System.out.println("SBI-loan"); // method overriding
	}
	
}

 class Hdfc extends Bank // sub class , inheritance
{
	public void loan()
	{
		System.out.println("HDFC BANK DETAILS"); 
		System.out.println("HDFC-loan");          // method overriding
	}
	
	}
