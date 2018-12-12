#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int max(int a, int b){
	return a > b ? a:b;
}
int main(void){
	
	int n, a, i, sum = 0;
	
	scanf("%d", &n);
	
	if(n <= 2){
		printf("0\n");
		return 0;
	}
	
	if(n%2 == 0){
		for(i = 1; i <= n/2; i++){
			sum += 2*(i-1);
		}
		
		sum *= 2;ü‘ÎÌ
	}else{
		for(i = 1; i <= n/2; i++){
			sum += max(2*(i-1)-1, 0);
		}
		sum*=2;
		sum+=2*(i-1)-1;
	}
	
	printf("%d\n", sum);
	
	return 0;
}