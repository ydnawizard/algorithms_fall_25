//Defines class for populating two arrays of size 10k with ints between 1 - 1000000

import java.util.ArrayList;
import java.util.Random;

public class quickSortTest {
	public static void test() {
		ArrayList<TestInteger> arr1 = new ArrayList<TestInteger>();
		Random random = new Random();
		for(int i = 0; i < 10000; i++) {
			int random_int = random.nextInt(999999) + 1;
			TestInteger test = new TestInteger(random_int);
			arr1.add(test);
		}
		QuickSort.main(arr1);
		System.out.println(arr1.get(0).getCounter());
		System.out.println(arr1.get(0).getStaticCounter());
	}
	public static void testAscending() {
		ArrayList<TestInteger> arr1 = new ArrayList<TestInteger>();
		for(int i = 0; i < 10000; i++) {
			TestInteger test = new TestInteger(i);
			arr1.add(test);
		}
		QuickSort.main(arr1);
		System.out.println(arr1.get(0).getCounter());
		System.out.println(arr1.get(0).getStaticCounter());
	}
	public static void test10Ascending() {
		Random random = new Random();
		for(int h = 0; h < 10; h++) {
			int random_int = random.nextInt(999) + 1;
			ArrayList<TestInteger> arr1 = new ArrayList<TestInteger>();
			for(int i = 0; i < 1000; i++) {
				TestInteger test = new TestInteger(random_int);
				random_int = ((random_int + 1) % 1000);
				arr1.add(test);
			}
			QuickSort.main(arr1);
			System.out.println(arr1.get(0).getCounter());
			System.out.println(arr1.get(0).getStaticCounter());
		}
	}
	public static void test10Descending() {
		Random random = new Random();
		for(int h = 0; h < 10; h++) {
			int random_int = random.nextInt(999) + 1;
			ArrayList<TestInteger> arr1 = new ArrayList<TestInteger>();
			for(int i = 0; i < 1000; i++) {
				TestInteger test = new TestInteger(random_int);
				random_int = ((random_int - 1) % 1000000);
				arr1.add(test);
			}
			QuickSort.main(arr1);
			System.out.println(arr1.get(0).getCounter());
			System.out.println(arr1.get(0).getStaticCounter());
		}
	}
	public static void testRandomized() {
		ArrayList<TestInteger> arr1 = new ArrayList<TestInteger>();
		Random random = new Random();
		for(int i = 0; i < 10000; i++) {
			int random_int = random.nextInt(999999) + 1;
			TestInteger test = new TestInteger(random_int);
			arr1.add(test);
		}
		RandomizedQuickSort.main(arr1);
		System.out.println(arr1.get(0).getCounter());
		System.out.println(arr1.get(0).getStaticCounter());
	}
	public static void testMedian() {
		ArrayList<TestInteger> arr1 = new ArrayList<TestInteger>();
		Random random = new Random();
		for(int i = 0; i < 10000; i++) {
			int random_int = random.nextInt(999999) + 1;
			TestInteger test = new TestInteger(random_int);
			arr1.add(test);
		}
		MedianThreeQuickSort.main(arr1);
		System.out.println(arr1.get(0).getCounter());
		System.out.println(arr1.get(0).getStaticCounter());
	}
	public static void testSwitch() {
		ArrayList<TestInteger> arr1 = new ArrayList<TestInteger>();
		Random random = new Random();
		for(int i = 0; i < 10000; i++) {
			int random_int = random.nextInt(999999) + 1;
			TestInteger test = new TestInteger(random_int);
			arr1.add(test);
		}
		SwitchSort.main(arr1);
		System.out.println(arr1.get(0).getCounter());
		System.out.println(arr1.get(0).getStaticCounter());
	}
	public static void main(String[] args) {
		testSwitch();
	}

}
