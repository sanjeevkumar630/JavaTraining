package javasessions;

public class LocalVsGlobal {
	
	String name="Sanjeev Kumar";// global variables
	
	int i=10;

	public static void main(String[] args) {
		
		int i=15;
		System.out.println(i);
		
		LocalVsGlobal ob=new LocalVsGlobal();
		System.out.println(ob.name);
		System.out.println(ob.i);
		ob.sum();
		
		
	}
	
	public void sum() {
		int i=20;
		int j=30;
		int k=i+j;
		System.out.println(k);
		
		System.out.println(this.i);
	}

}
