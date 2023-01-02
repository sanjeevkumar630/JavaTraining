package javasessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int a[]=new int[4]; // fixed size in nature. to over come go for collections
		
		a[0]=10;  // these all are similar data type of values. to over come go for Object Array
		a[1]=20;
		a[2]=30;
		a[3]=40;
		//System.out.println(a[0]);
		
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
			
		}
		
		Object ob[]=new Object[5]; // Object array it will store different data type values
		
		ob[0]="sanjeev";
		ob[1]=25;
		ob[2]=25000.243;
		ob[3]="Hyd";
		ob[4]="M";
		
		//System.out.println(ob[3]);
		
		for(int k=0;k<ob.length;k++) {
			
			System.out.println(ob[k]);
			
		}
	}

}
