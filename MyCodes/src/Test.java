import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		int tle = n * m;
		int minr = 0, minc = 0, maxc = m - 1, maxr = n - 1;
		while (count < tle) {
			for (int i = minc, j = minr; i <= maxc && count < tle; i++) {
				System.out.print(a[j][i] + " ");
				count++;
			}
			minr++;
			for (int i = minr, j = maxc; i <= maxr && count < tle; i++) {
				System.out.print(a[i][j] + " ");
				count++;
			}
			maxc--;
			for (int i = maxc, j = maxr; i >= minc && count < tle; i--) {
				System.out.print(a[j][i] + " ");
				count++;
			}
			maxr--;
			for (int i = maxr, j = minc; i>=minr && count<tle; i--) {
				System.out.print(a[i][j] + " ");
				count++;
			}
			minc++;
			
			
		}
	}
}