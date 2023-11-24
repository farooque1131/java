class Division{

	void numberDivision(){
		
		for(int index = 1;index<=100;index++){
			if( index % 5 == 0 && index % 7 == 0){
				System.out.println("number ="+ index);
			}
			else
			{
			System.out.println("not divisiable");	
			}
			System.out.println(index);
			
		}
	}
	
	void numberDivision1(){
		for(int index1 = 1;index1 <= 100; index1++){
			if( index1 % 7 == 0 || index1 % 30 == 0){
				System.out.println("number ="+ index1);
			}
			else
			{
			System.out.println("not divisiable");	
			}
			System.out.println(index1);
		
	}
	}
	
	public static void main(String[] args){
		Division division = new Division();
		division.numberDivision();
		division.numberDivision1();
	}

}