class Calculator{
	
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		//nt total = num1 + num2;
		System.out.println("Addition of num :"+ (num1 + num2));
	}
	void sub(){
		int total = num1 - num2;
		System.out.println("Subtraction of num :"+total);
	}
	void div(){
		int total = num1/num2;
		System.out.println("Division of num :"+total);
	}
	void mul(){
		int total = num1 * num2;
		System.out.println("Muliplication of num :"+total);
	}
	
	public static void main (String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.div();
		calculator.mul();
	}

}