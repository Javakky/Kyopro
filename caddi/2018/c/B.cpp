#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define rep(i, n) for(int i = 0; i < (int)(n); i++)
typedef long l;

int gcd(int a, int b){return b ? gcd(b, a%b): a;}

int max(int a, int b){return a > b ? a: b;}
int min(int a, int b){return a < b ? a: b;}

int main(void){
	
	int a, b, n, h, w, sum = 0;
	
	scanf("%d", &n);
	scanf("%d", &h);
	scanf("%d", &w);
	int i;
	for(i = 0; i < n; i++){
		scanf("%d", &a);
		scanf("%d", &b);
		
		if(h <= a && w <= b){sum++;}
	}
	
	printf("%d\n", sum);
	
	return 0;
}