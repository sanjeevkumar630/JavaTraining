package javasessions;

public class LoopConcept {
	
	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			
			System.out.println(i);
			i++;// it will give infinite loop if you dont give increment or dicrement
			
		}
		System.out.println("===============");
		for(int j=1; j<=10; j++) {
			
			System.out.println(j);
			
		}
		System.out.println("===============");
		for(int k=10; k>=1; k--) {
			
			System.out.println(k);
			
		}
		
	}

}
