package codingtest;

class SmallestMissing {
	int findFirstMissing(int array[], int start, int end) {
		if (start > end)
			return end + 1;

		if (start != array[start])
			return start;

		int mid = (start + end) / 2;

		// Left half has all elements from 0 to mid
		if (array[mid] == mid)
			return findFirstMissing(array, mid + 1, end);

		return findFirstMissing(array, start, mid);
	}

	// Driver program to test the above function
	public static void main(String[] args) {
		SmallestMissing small = new SmallestMissing();
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 10 };
		int p[] = new int[arr.length+2];
		
		for(int i=0;i<arr.length;i++) {
			if(p[i] == arr[i])
				p[i]+=1;
			else {
				if(i==arr[i])
					p[i]=1;
				else {
					System.out.println("missing "+i);
				}
			}
		}
		int counter =0;
		for(int g:p) {
			System.out.println(counter+" "+g);
			counter++;
		}
		int n = arr.length;
		System.out.println("First Missing element is : " +small.findFirstMissing(arr, 0, n - 1));
	}
}
