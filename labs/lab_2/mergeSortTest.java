import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

public class mergeSortTest {
	private static int size = 10000;
	public static void test() {
		TestInteger[] arr1 =  new TestInteger[size];
		Random random = new Random();
		for(int i = 0; i < size; i++) {
			int random_int = random.nextInt(999999) + 1;
			TestInteger test = new TestInteger(random_int);
			arr1[i] = test;
		}
		Arrays.sort(arr1);
		System.out.println(arr1[0].getCounter());
		System.out.println(arr1[0].getStaticCounter());
	}
	public static void testAscending() {
		TestInteger[] arr1 =  new TestInteger[size];
		for(int i = 0; i < size; i++) {
			TestInteger test = new TestInteger(i);
			arr1[i] = test;
		}
		Arrays.sort(arr1);
		System.out.println(arr1[0].getCounter());
		System.out.println(arr1[0].getStaticCounter());
	}
	public static void test10Ascending() {
		Random random = new Random();
		for(int h = 0; h < 10; h++) {
			int random_int = random.nextInt(999999) + 1;
			TestInteger[] arr1 = new TestInteger[1000];
			for(int i = 0; i < 1000; i++) {
				TestInteger test = new TestInteger(random_int);
				random_int = ((random_int + 1) % 1000);
				arr1[i] = test;
			}
			long startTime = System.nanoTime();
			Arrays.sort(arr1);
			long endTime = System.nanoTime();
			long duration = endTime - startTime;
			System.out.println(duration/1_000_000_000.0);
			System.out.println(arr1[0].getCounter());
			System.out.println(arr1[0].getStaticCounter());
		}
	}
	public static void test10Descending() {
		Random random = new Random();
		for(int h = 0; h < 10; h++) {
			int random_int = random.nextInt(999999) + 1;
			TestInteger[] arr1 = new TestInteger[1000];
			for(int i = 0; i < 1000; i++) {
				TestInteger test = new TestInteger(random_int);
				random_int = ((random_int - 1) % 1000);
				arr1[i] = test;
			}
			long startTime = System.nanoTime();
			Arrays.sort(arr1);
			long endTime = System.nanoTime();
			long duration = endTime - startTime;
			System.out.println(duration/1_000_000_000.0);
			System.out.println(arr1[0].getCounter());
			System.out.println(arr1[0].getStaticCounter());
		}
	}
	public static void main(String[] args) {
		test10Descending();
	}
		
}
