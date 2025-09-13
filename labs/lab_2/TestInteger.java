//Defines the comparable interface and test_integer class


public class TestInteger implements Comparable<TestInteger>{
	public int value;
	public long counter = 0;
	public static long staticCounter = 0;
	public TestInteger(int value) {
		this.value = value;
	}
	public void increment() {
		this.counter += 1;
		this.staticCounter += 1;
	}
	public int compareTo(TestInteger other) {
		this.increment();
		return Integer.compare(this.value, other.value);
	}
	public long getCounter() {
		return this.counter;
	}
	public long getStaticCounter() {
		return this.staticCounter;
	}
	public void resetCounter() {
		this.counter = 0;
	}
	public void resetStaticCounter() {
		this.staticCounter = 0;
	}
}
