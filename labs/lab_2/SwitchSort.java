import java.util.ArrayList;
import java.util.Collections;

public class SwitchSort{
	private static int partition(ArrayList<TestInteger> arr,int low,int high) {
		int i = (low - 1);
		for(int j=low; j<high; j++) {
			if(arr.get(j).compareTo(arr.get(high)) < 1) {
				i++;
				Collections.swap(arr, i, j);
			}
		}
		Collections.swap(arr, i+1,high);

		return i + 1;
	}

	public static void sort(ArrayList<TestInteger> arr,int low, int high) {
		if (low < (high-(high/4))) {
			int pi = partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}else
		{
			InsertionSort.sort(arr);
			return;
		}
	}

	public static void main(ArrayList<TestInteger> arr) {
		long startTime = System.nanoTime();
		sort(arr, 0, 999);
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(duration/1_000_000_000.0);
		/*for(int i=0; i < 9999; i++) {
			System.out.println(arr.get(i).value);
		}
		*/
	}
}
