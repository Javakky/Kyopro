#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int main(void){
	
	long* a;
	
	long n;
	
	int flg;
	
	long island = 0, height = 0, lan, lanb = 0;
	
	scanf("%ld", &n);
	
	a = (long*)calloc(n+1, sizeof(long));
	
	for(int i = 0; i < n; i++){
		scanf("%ld", &a[i]);
		if(a[i] > height) height = a[i];
	}
	
	for(int i = 0; i <= height; i++){
		lan = 0;
		flg = 0;
		for(int j = 0; j < n; j++){
			if(a[j] > i){
				if(!flg){
					flg = 1;
					lan++;
				}
			}
			else{
				if(flg) flg = 0;
			}
			if((n-j-1)/2+lan < island-1) break;
		}
		if(lan > island) island = lan;
		if(lanb > lan)break;
		lanb = lan;
	}
	
	printf("%ld\n", island);
	
	return (0);
}