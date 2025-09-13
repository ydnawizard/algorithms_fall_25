import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;

public class MedianThreeQuickSort{
	private static int median(int med1,int med2,int med3) {
		int[] meds = {med1,med2,med3};
		for(int i = 0; i < 3; i++) {
			if (meds[i] < meds[Math.abs((i + 1)%3)] && meds[i] > meds[Math.abs((i - 1)%3)]) {
				return meds[i];
			}else if(meds[i] < meds[Math.abs((i + 1)%3)] && meds[i] > meds[Math.abs((i - 1)%3)]) {
				return meds[i];
			}
		}
		return 0;
	}

	private static int partition(ArrayList<TestInteger> arr,int low,int high) {
		Random random = new Random();
		int med1 = random.nextInt(high);
		int med2 = random.nextInt(high);
		int med3 = random.nextInt(high);
		int pivot = median(med1,med2,med3);
		int i = (low - 1);
		for(int j=low; j<high; j++) {
			if(arr.get(j).compareTo(arr.get(pivot)) < 1) {
				i++;
				Collections.swap(arr, i, j);
			}
		}
		Collections.swap(arr, i+1,high);

		return i + 1;
	}

	public static void sort(ArrayList<TestInteger> arr,int low, int high) {
		if (low < high) {
			int pi = partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
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
