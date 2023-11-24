class STUDENTMARKS{
		
		String studentname;
		
		void student(String newStudent, int marks){
			studentname = newStudent;
			if(marks >= 90 || marks >= 100 ){
				System.out.println(newStudent +" "+ "A+");
			}
			else if(marks >= 80 || marks == 90)
			{
				System.out.println(newStudent +" "+ "A");
			}
			else if(marks >= 70 || marks == 90)
			{
				System.out.println(newStudent+" "+"B+");
			}
			else{
				System.out.println("you need to work harder!!");
			}
			}
			
			
		
		public static void main(String[] args){
			STUDENTMARKS studentmarks = new STUDENTMARKS();
			studentmarks.student("FAROOQUE", 10);
		}
	}