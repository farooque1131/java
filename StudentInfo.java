class StudentInfo{
	String name;
	String surname;
	int birthdate;
	String address;
	int rollNumber;
	void setData(int rollNumber1,String firstName, String lastName, String address1, int dateOfBirth){
		name = firstName;
		surname = lastName;
		birthdate = dateOfBirth;
		address	= address1;
		rollNumber = rollNumber1;
	}
	void studentName(){
		System.out.println("Name :"+name);
		System.out.println("Surname :"+surname);
		System.out.println("Address :"+address);
}
	void studentDetail(){
		System.out.println("Date of Birth :"+ birthdate);
		System.out.println("Rollnumber :"+rollNumber);
	}
	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData(12,"farooque","shaikh","itd",11);
		studentinfo.studentName();
		studentinfo.studentDetail();
	}
}