
public class Test1 {
	 static void leftRotate(int arr[], int d, int n)
	    {
	        // Creating temp array of size d
	        int temp[] = new int[d];
	 
	        // Copying first d element in array temp
	        for (int i = 0; i < d; i++)
	            temp[i] = arr[i];
	 
	        // Moving the rest element to index
	        // zero to N-d
	        for (int i = d; i < n; i++) {
	            arr[i - d] = arr[i];
	        }
	 
	        // Copying the temp array element
	        // in original array
	        for (int i = 0; i < d; i++) {
	            arr[i + n - d] = temp[i];
	        }
	    }
	 

	public static void main(String[] args) {
		
		int left[] = {1,2,3,4,5,6,7};
		leftRotate(left,2,left.length);
		for(int j:left) {
			System.out.println(j);
		}
		/*
		
		 int arr[] = {1,3,3,1,3,1,1,4}; // it should be 2
		 // ans 14
		 int minSum = 0;
		 int otherSum=0;
			for (int i = 0; i < arr.length; i++) {
				otherSum=0;
				for (int j = 0 ; j < arr.length; j++) {
					if(i != j) {
						otherSum+=arr[j];
					}
				}
				if(i ==0)
					minSum = otherSum;
				
				if(minSum > otherSum) {
					minSum = otherSum;
				}
			}
			
			System.out.println(minSum);*/
	}

}
