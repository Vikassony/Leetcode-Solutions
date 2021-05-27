import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int temp[] = new int[n];
		int k = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1])
				temp[k++] = a[i];
		}
		temp[k++] = a[n - 1];
		for (int i = 0; i < k; i++)
			a[i] = temp[i];
		for (int i = 0; i < k; i++)
			System.out.print(a[i] + " ");

	}
}
