class Practice1{
		
		void lift(int floor){
			
			if(floor == 1){
				System.out.println("It's First Floor");
			}
			else if(floor == 2){
				System.out.println("It's Second Floor");
			}
			else if(floor == 3){
				System.out.println("It's Thirt Floor");
			}
			else{
				System.out.println("Invalid number");
			}
				if(floor == 1 && floor == 2){
					System.out.println("Its Stuff office");
				}
				if(floor == 3){
					System.out.println("Office");
				}
			
				
		}
		
		public static void main(String[] args){
			Practice1 practice1 = new Parctice1();
			practice1.lift(1);
		}
			
	}
