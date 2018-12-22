#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define rep(i, n) for(int i = 0; i < (int)(n); i++)
typedef long l;

int gcd(int a, int b){return b ? gcd(b, a%b): a;}

int max(int a, int b){return a > b ? a: b;}
int min(int a, int b){return a < b ? a: b;}

int main(void){
	
	char c;
	int sum = 0;
	
	while (scanf("%c", &c) != EOF){
		if(c == '2'){
			sum++;
		}
	}
	
	printf("%d\n", sum);
	
	return 0;
}