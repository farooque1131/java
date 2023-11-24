class NestedWeeks{
	
	void monthDays(int monthDays){
		
		if( monthDays == 1){
			System.out.println("January");
		} 
		else if( monthDays == 2){
			System.out.println("February");
		} 
		else if( monthDays == 3){
			System.out.println("March");
		} 
		else if( monthDays == 4){
			System.out.println("April");
		}
		else if( monthDays == 5){
			System.out.println("May");
		} 
		else if( monthDays == 6){
			System.out.println("June");
		} 
		else if( monthDays == 7){
			System.out.println("July");
		} 	
		else if( monthDays == 8){
			System.out.println("August");
		} 	
		else if( monthDays == 9){
			System.out.println("September");
		} 
		else if( monthDays == 10){
			System.out.println("October");
		} 
		else if( monthDays == 11){
			System.out.println("November");
		} 
		else if( monthDays == 12){
			System.out.println("December");
		}
		else
		{
		System.out.println("Invalid input");	
		}
			if( monthDays >= 1 && monthDays <= 3){
				System.out.println("Qotor 1");
				System.out.println("Winter");
			}
			if( monthDays >= 4 && monthDays <= 6){
				System.out.println("Qotor 2");
				System.out.println("Summer");
			}
			if ( monthDays >= 7 && monthDays <= 9){
				System.out.println("Rain");
			}
			if ( monthDays >= 10 && monthDays <= 12){
				System.out.println("Qotor 4");
				System.out.println("Winter");
			}
	
	}
	
	public static void main(String[] args){
		NestedWeeks nestedweeks = new NestedWeeks();
		nestedweeks.monthDays(4);	
	}

}