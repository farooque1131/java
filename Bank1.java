class Bank1{
	int initialBalance = 1000;
	
	void debit(int atm){
		initialBalance = initialBalance - atm;
	}
	void credit(int atm){
		initialBalance = initialBalance + atm;
	}
	void print(){
		System.out.println("current balamce :" + initialBalance);		
	}
	
	public static void main(String[] a){
	Bank1 bank1 = new Bank1();
	bank1.debit(200);
	bank1.credit(500);
	bank1.credit(1000);
	bank1.debit(300);
	bank1.credit(4000);
	bank1.print();
	}
}