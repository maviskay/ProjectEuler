public class two {

	public static void main(String[] args) {
		int first = 1, second = 2, sum = 2;
		
		while (second < 4000000) {
			int temp = first + second;
			if (temp%2 == 0)
				sum += temp;
			first = second;
			second = temp;
		}
		
		System.out.println("Sum: " + sum);
	}
}