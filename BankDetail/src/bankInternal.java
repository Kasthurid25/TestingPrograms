import java.util.Scanner;
class bankInternal{
	int acno;
	float bal=0;
	
	Scanner get= new Scanner(System.in);
	bankInternal()
	{
		System.out.println("enter the account number:");
		acno=get.nextInt();
		System.out.println("enter the initial amount:");
		bal=get.nextFloat();
	}
	void deposit()
	{
		float amount;
		System.out.println("enter amount to be deposited:");
		amount =get.nextFloat();
		bal=bal+amount;
		System.out.println("deposited !account balance is"+bal);
	}
		void withdraw()
	{
		float amount;
		
		System.out.println("enter amount to be withdrawn:");
		amount=get.nextFloat();
		if(amount<bal)
		{
			bal=bal-amount;
			System.out.println("AMOUNT withdrawn!!available balance:"+bal);
			}
		else
		{
			System.out.println("insufficient funds!!");
			}
	}

public static void main(String[] args) {
bankInternal myobj=new bankInternal();
myobj.deposit();
myobj.withdraw();
}
}

