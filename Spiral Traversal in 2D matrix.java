import java.util.*;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		int tle = a.length * a[0].length;
		int n = a.length;
		int m = a[0].length;
		int minr = 0, minc = 0, maxc = m - 1, maxr = n - 1;
		while (count < tle) {
			for (int i = minc, j = minr; i <= maxc && count < tle; i++) {
				System.out.println(a[j][i]);
				count++;
			}
			minr++;
			for (int i = minr, j = maxc; i <= maxr && count < tle; i++) {
				System.out.println(a[i][j]);
				count++;
			}
			maxc--;
			for (int i = maxc, j = maxr; i >= minc && count < tle; i--) {
				System.out.println(a[j][i]);
				count++;
			}
			maxr--;
			for (int i = maxr, j = minc; i >= minr && count < tle; i--) {
				System.out.println(a[i][j]);
				count++;
			}
			minc++;

		}
	}
}
