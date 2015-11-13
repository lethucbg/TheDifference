public class BuilderAndBuffer {
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder("Hello");
		long time = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			strBuilder.append("World");
		}
		System.out.println("Time to process with StringBuilder is: "
				+ ((System.currentTimeMillis() - time)));
		StringBuffer strBuffer = new StringBuffer("Hello");
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			strBuffer.append("World");
		}
		System.out.println("Time to process with StringBuffer is: "
				+ ((System.currentTimeMillis() - time1)));
	}
}
