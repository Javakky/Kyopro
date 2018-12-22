#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define rep(i, n) for(int i = 0; i < (int)(n); i++)
typedef long ll;

int gcd(int a, int b){return b ? gcd(b, a%b): a;}

int max(int a, int b){return a > b ? a: b;}
int min(int a, int b){return a < b ? a: b;}

int main(void){
	
	long long a, b, sum = 0, guusu = 0;
	
	scanf("%lld", &a);
	
	for(long long i = 0; i < a; i++){
		scanf("%lld", &b);
		if(b % 2 == 1)
			sum += b;
		else guusu = guusu % 2 == 0 ? 1: 0;
	}
	
	
	if(sum % 2 + guusu % 2 -1 == 0){
		printf("second\n");
	}else{
		printf("first\n");
	}
	
	return 0;
}