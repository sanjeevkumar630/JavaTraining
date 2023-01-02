package arrays;

public class SecondLargest {

	static int temp;

	public static void secondLargestNo(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}for(int i=1;i<a.length;i++) {
			System.out.println("Second Largest number is:  "+a[i]+" ");
			break;
		}
		

	}

	public static void secondSmallestNo(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}for(int i=1;i<a.length;i++) {
			System.out.println("Second Smallest number is:  "+a[i]+" ");
			break;
		}

	}

	public static void main(String[] args) {
		int a[]= {2,3,45,67,87,56,44,33,12,34,78};
		secondLargestNo(a);
		secondSmallestNo(a);

	

}}
