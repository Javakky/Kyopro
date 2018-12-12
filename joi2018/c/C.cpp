#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int main(void){
	
	int n, sum = 0;
	char s1, s2;
	
	scanf("%d", &n);
	scanf("%c", &s1);
	scanf("%c", &s1);
	for(int i = 1; i < n; i++){
		scanf("%c", &s2);
		if(s1==s2) s1 = s2;
		else{
			sum++;
			i++;
			scanf("%c", &s1);
		}
	}
	
	printf("%d\n", sum);
	
	return (0);
}