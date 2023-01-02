package arrays;

public class DuplicateArray {

	public static void duplicate(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate elements in given array:" + a[j]);

				}

			}

		}
	}

	public static void reverse(int a[]) {
		for (int i = a.length - 1; i >= 0; --i) {
			System.out.println(a[i]);

		}
	}

	public static void sumOfArray(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("Sum of given Array is:" + sum);
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 3, 4, 5 };
		duplicate(a);
		reverse(a);
		sumOfArray(a);

	}

}
