public class Multi {
	public static int[][] ary = { {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 
					{11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
					{21, 22, 23, 24, 25, 26, 27, 28, 29, 30} };

	public static int[][] a = {1,2,3,4,5,6};

public static void main(String[] args) {
	
		// sumRow(a);
		// sumCol(a, 1);
		snakeDraft(3,10);
		rectangularize (a,3,2);
		// print(a);
}
	// public static int print(int[][] a) {
	// 	for (int r=0; r<a.length; r++) {
	// 		for (int c=0; c<a[r].length; c++) {
	// 			System.out.print(a[r][c] + " ");
	// 		}
	// 		System.out.println(a);
	// 	}
	// 	return 7;
	// }
	// public static int sumRow(int[][] a) {
	// 	int sum = 0;
	// 	for (int r=0; r<a.length; r++) {
	// 		for (int c=0; c<a[r].length; c++) {
	// 			sum = sum + a[r][c];
	// 		}
	// 		System.out.println(sum);
	// 		System.out.println();
	// 	}
	// 	return sum;

	// }

	// public static int sumCol(int[][] a, int c) {
	// 	int sum =0;
	// 	for (int c=0; c<a[c].length;c++) {
	// 		sum = sum + a[r][c];
		// }
	// 	System.out.println(sum);
	// 	System.out.println();
	// 	return sum;
	// }

	public static void snakeDraft(int players, int rounds) {

		for (int p=0; p<players; p++) {
			
			if (p%2==0) { //even
				for (int r=0; r<rounds; r++) {
					System.out.print(ary[p][r] + " ");
				} 
				System.out.println();
			} else {

				for (int r=(rounds-1); r>=0; r--) {
					System.out.print(ary[p][r] + " ");
				}
				System.out.println();
			}
		}
}
	public static void rectangularize(int[][] a, int rows, int cols) {

		for (int r=0; r<rows; r++) {
			for (int c=0; c<cols; c++) {
				System.out.println(a[r][c] + " ");
			}
			System.out.println();
		}
	}

}


