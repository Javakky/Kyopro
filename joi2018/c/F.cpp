#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int main(void){
	
	int a, b, c;
	
	scanf("%d %d %d", &a, &b, &c);
	int week = a*7+b;
	
	printf("%d\n", (c/week)+((c%week)/a+((c%week)%a > 0? 1: 0)));
	return (0);
}