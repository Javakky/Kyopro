#include <stdio.h>
#include <stdlib.h>
#include <math.h>



int main(void){
	
	int n, i, div = 0;
	
	scanf("%d", &n);
	
	for(i = 1; i <= n; i++){
		div += divisors_count(n);
	}
	
	printf("%d\n", (div*n)% 1000000007);
	return 0;
}