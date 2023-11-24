class ifElse{
	
	void process(int num1, int num2){
	if(num1 > num2){
		System.out.println("num1 is greater than num2" +" "+ num1);
	}else{
		System.out.println("num2 is greater" +" "+ num2);
	}
	if(num1 < num2){
		System.out.println("num1 is greater than num2" +" "+ num1);
	}else{
		System.out.println("num2 is smaller" +" "+num2);
	}
	
	}
	
	public static void main(String[] args){
	ifElse ifelse = new ifElse();
	ifelse.process(20,13);
	}
	
	
}