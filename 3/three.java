public class three {

	public static void main(String[] args) {
		long value = 600851475143L, squaredVal;
		
		squaredVal = (long) Math.sqrt(value) + 1;
		
		if (squaredVal%2 == 0)
			findLargest(value, squaredVal - 1);
		else
			findLargest(value, squaredVal);
	}
	
	public static void findLargest(long number, long prime){
		while (prime >= 2){
			if (number%prime == 0){
				if (checkPrime(prime)){
					System.out.println("Prime: " + prime);
					System.exit(0);
				}
			}
			prime -= 2;
		}
	}
	
	public static boolean checkPrime(long prime){
		for (int i = 2; i < prime; i++){
			if (prime%i ==0)
				return false;
		}
		return true;
	}
}