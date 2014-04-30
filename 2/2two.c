#include <stdio.h>

int main(int argc, char *argv[])
{
	int i = 1, j = 2, sum = 0;
	
	while (i < 4000000 && j < 4000000){
		if( (i%2 == 0))
			sum = sum + i;
		if ((j%2 == 0))
			sum = sum + j;
		i = i + j;
		j = i + j;
	}
	printf("%d\n", sum);
	
	return 0;
}