package matrixarraymultidimentional;

public class ThreeByThree {

	public static void main(String[] args) {
		int p[][] = new int[3][3];
		int count =0;
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p.length;j++) {
				p[i][j] = ++count; 
			}
		}
		System.out.println();
		int D[][] = new int[3][3];
		
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p.length;j++) {
				D[i][j] = p[j][i] ; 
			}
		}
		System.out.println();
	}

}
/*
00 01 02
10 11 12
20 21 22

00 -> 00 + 01 +10 + 11

01 -> 00 + 02 +10+11+12

/*

[[1, 4, 7], 
[2, 5, 8], 
[3, 6, 9]]

*/
