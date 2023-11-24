class Manager{
	
	String name = "Subodh";
	int salary = 5;
	
	void display(){
		System.out.println("Manager name: " + name);
		System.out.println("Manager salary: " + salary);
		EmployeeDetail employdetail = new EmployeeDetail();
		employdetail.detail(0);
		
		
	}
	public static void main (String[] args){
		Manager manager = new Manager();
		manager.display();
	}
	
	
}