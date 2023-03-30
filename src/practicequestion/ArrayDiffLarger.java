package practicequestion;

public class ArrayDiffLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
		int[] arr = {7, 9, 5, 6, 3, 2};
		System.out.println(findMaxDiff(arr));
	}

	private static int  findMaxDiff(int[] arr) {
		int max_diff = 0;
		max_diff = arr[1] - arr[0];
		for(int i=0;i<arr.length;i++) {
		
			for(int j =  i+1;j<arr.length;j++) {
				if(arr[j] - arr[i] > max_diff) {
					max_diff = arr[j]-arr[i];
				}
			}
		}
		return max_diff;
	}

}
