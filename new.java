class Student{
	
	String name = "Farooque";
	int rollNumber = 1;
	
	void display(){
		System.out.println("Sudent name is " + name);
		System.out.println("Sudent rollNumber is " + rollNumber);
	}   

	public static void main(String[] a){
		Student std = new Student();
		std.display();
	}
}