#include <stdio.h>

int main(int argc, char *argv[])
{
	unsigned long long int num = 600851475143, prime = 2;
	
	while (num > 1){
		if (num%prime == 0)
			num /= prime;
		else
			prime++;
	}	
	printf("%llu\n", prime);
	return 0;
}