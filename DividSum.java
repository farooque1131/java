class DividSum{

	void sum(){
		for(int index = 4 ; index <= 100 ; index++ ){
			if(index % 4 == 0){
				System.out.println(index);
				System.out.println("hi");
				
			}
			else if(index % 3 == 0){
				System.out.println(index);
				System.out.println("1");
			}
			else if(index % 5 == 0){
				System.out.println(index);
				System.out.println("2");
			}
			else{
				System.out.println("not found");
				System.out.println("3");
			}
			if(index % 3 == 0 && index% 4 == 0 && index % 5 == 0){
					System.out.print("best number");
				}
				
			}
		
	}
	
	public static void main(String[] args){
		DividSum dividsum = new DividSum();
		dividsum.sum();
	}

}8