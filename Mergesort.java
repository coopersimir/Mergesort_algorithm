public class MergeSort {
	double [] get_left(double[] arr) {
		int size = arr.length/2;
		double [] left = new double[size];
		for (int i = 0; i < size; i++) {
			left[i] = arr[i];
		}
		return left;
	}
	
	double [] get_right(double[] arr) {
		int size =0;
		if(arr.length%2!=0) {
			size = arr.length/2 + 1;
		}
		else {
			size =arr.length/2;
		}
		
		double [] right = new double[size];
		for (int i = 0; i < size; i++) {
			right[i] = arr[i+size-1];
		}
		return right;
	}
	
	void merge(double [] left, double [] right, double []merged_array){
		int l=0, r=0, t=0;
		while(l<left.length && r<right.length) {
			if(left[l]<=right[r]) {
				merged_array[t++] = left[l++];
			}
			else {
				merged_array[t++] = right[r++];
			}
		}
		while(l<left.length) {
			merged_array[t++] = left[l++];
		}
		while(r<right.length) {
			merged_array[t++] = right[r++];
		}
	}
	void sort(double []arr) {
		if(arr.length> 1) {
			double [] left = get_left(arr);
			double [] right = get_right(arr);
			sort(left);
			sort(right);
			merge(left, right,arr);
		}
	}
	void printArray(double arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
 } 

	public static void main(String[] args) {
		MergeSort ob = new MergeSort();
		double arr[] = { 12, 11, 13, 5, 6 }; 
		ob.sort(arr); 
		ob.printArray(arr); 

	}

}
