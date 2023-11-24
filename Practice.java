class Sum{

	int num1 = 74;
	int num2 = 36;
	int num3 = num1 + num2;
	
	void display(){
		System.out.println("addition of two: "+num3);
	}
	
	public static void main(String[] a){
		Sum std = new Sum();
		std.display();
	}
		
}