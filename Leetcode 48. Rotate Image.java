class Solution {
    public void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
				for (int j = i; j < matrix[0].length; j++) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
			for (int i = 0; i < matrix.length; i++) {
				int li = 0;
				int ri = matrix[i].length-1;
				while (li < ri) {
					int temp = matrix[i][li];
					matrix[i][li] = matrix[i][ri];
					matrix[i][ri] = temp;
					li++;
					ri--;
				}

			}
        
        // after taking another array..
        // int a[]= new int[matrix.length*matrix[0].length];
		// int k=0;
		// for (int i = 0; i < matrix.length; i++) {
		// 	for (int j = 0; j < matrix[0].length; j++) {
		// 		a[k++] = matrix[i][j];
		// 	}
		// }
		// k = 0;
		// for (int i = matrix.length - 1; i >= 0; i--) {
		// 	for (int j = 0; j < matrix[0].length; j++)
		// 		matrix[j][i] = a[k++];
		// }
    
    }
}
