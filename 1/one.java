public class one {

	public static void main(String[] args) {
		int sum = 8;
		
		for (int i = 6; i < 1000; i++) {
			if (i%3 == 0 || i%5 == 0)
				sum += i;
		}
		
		System.out.println("Sum: " + sum);
	}
}