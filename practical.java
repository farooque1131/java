class practical{

	void process(){
		for(int index=1; index <= 100;){
			if(index%2==0 && index%5==0){
				System.out.println(index);
				index++;
				System.out.println(index);
				index++;
				break;
				
			}
		}
	}
	
	public static void main(String[] args){
		practical practical1 = new practical();
		practical1.process();
	}
	
}