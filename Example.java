class Example{
	int num1 = 100;
	int num2 = 250;
	
	void processData(){
	num1 = num1 - 10;
	}
	void display(){
	System.out.println(num1+num2);
	}
	public static void main(String[] a){
	Example example1 = new Example();
	example1.processData(); //90
	example1.display();
	Example example2 = new Example();
	example2.display();
	}
}