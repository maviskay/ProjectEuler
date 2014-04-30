#include <stdio.h>

int main(int argc, char *argv[])
{
	int i, sum;
	
	for (i = 0; i < 1000; i++){
		if ((i%3 == 0)|| (i%5 == 0))
			sum = i + sum;
	}
	printf("%d\n", sum);
	
	return 0;
}