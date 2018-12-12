#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int main(void){
	
	int a, b, c;
	
	scanf("%d %d %d", &a, &b, &c);
	int res, day = 0;
	
	for(int res = 0; res < c; res += a){
		day++;
		if(day % 7 == 0) res += b;
	}
	
	printf("%d\n", day);
	
	return (0);
}