package arrays;

public class AscendingOrderOfArray {

	public static void acendingArray(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				if (a[i] > a[j]) {
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

	public static void main(String[] args) {

		int a[] = { 45, 34, 10, 8, 7, 6, 4, 3, 2, 1, 45 };

		acendingArray(a);
	}
}
