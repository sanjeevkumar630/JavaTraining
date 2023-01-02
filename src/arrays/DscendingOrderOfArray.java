package arrays;

public class DscendingOrderOfArray {

	public static void main(String[] args) {

		int a[] = { 45, 3, 9, 12, 10, 8, 7, 6, 4, 3, 2, 1 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}

	}

}
