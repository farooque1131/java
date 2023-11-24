class NEWBANK{
		
	int amount = 1000;
	
	void credit(int newAmount){
		amount = amount + newAmount ;
		System.out.println("credit :" + amount);
	}
		void debit(int debitAmount){
			//amount = amount - debitAmount;
			if(amount < debitAmount){
				System.out.println("Invalid: " + amount);
			}else{
				System.out.println("Amout debit :" + debitAmount);
				System.out.println("Remaining amount :" +amount);
			}
		}
	public	static void main(String[] args){
		NEWBANK newbank = new NEWBANK();
		newbank.credit(100);
		newbank.debit(1000);
	}
	
}