public class threeTrialDivide {

	public static void main(String[] args) {
		long value = 600851475143L;
		int divisor = 2;
		while (value > 1){
			if (value%divisor == 0)
				value /= divisor;
			else
				divisor += 1;
		}
		System.out.println("Prime: " + divisor); 
	}
}