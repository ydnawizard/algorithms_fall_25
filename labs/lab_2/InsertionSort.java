import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class InsertionSort {
	public static void sort(ArrayList<TestInteger> arr) {
		int n = arr.size();
		for (int i = 1; i < n; ++i) {
			TestInteger key = arr.get(i);
			int j = i - 1;
			while(j >=0 && arr.get(j).value > key.value) {
				Collections.swap(arr,j+1,j);
				j = j - 1;
			}
			arr.set(j+1, key);
		}
	}
}
