package practicequestion;

public class EquilibriumArray {
	public static void main(String[] args) {
		EquilibriumArray equi = new EquilibriumArray();
	  //      int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
	        
	        int arr[] = {3,5,3,1,4,8,4};
	        int arr_size = arr.length;
	 
	        // Function call
	        System.out.println(equi.equilibrium(arr, arr_size));
	}

	private int equilibrium(int[] arr, int arr_size) {

		int leftSum;
		int rightSum;
		for(int i=0;i<arr_size;i++) {
			
			leftSum=0;
			for(int j=0;j<i;j++) 
				leftSum += arr[j];
			
			rightSum=0;
			for(int j=i+1;j<arr_size;j++) 
				rightSum += arr[j];			
			
			if(leftSum == rightSum)
				return i;
			
		}
		
		return -1;
	}
}
