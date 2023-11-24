class Whilepractice{
	int num1=1;
	int sum = 0;
	int count = 0;
	
	void process(){
		while(sum<=50){
			sum=sum + num1;
			num1++;
		}
		System.out.println(num1+"fine");
	}
	
	public static void main(String[] args){
		Whilepractice whilepractice = new Whilepractice();
		whilepractice.process();
	}
}

