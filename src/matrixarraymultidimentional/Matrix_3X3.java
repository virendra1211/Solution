package matrixarraymultidimentional;

public class Matrix_3X3 {

	public static void main(String[] args) {
		int row,col;
		int arr[][] = {
				{1,2,3},
				{7,8,9},
				{3,4,5}
		};

		row = arr.length;
		col = arr[0].length;
		
		if(row!=col) {
			System.out.println("Matrix should be square matrix !!");
		}else {
			System.out.println("Triangle matrix");
			for(int i=0;i<row;i++) {
				
				for(int j=0;j<col;j++) {
					if(i<j)
						System.out.print("0 ");
					else {
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	}

}
