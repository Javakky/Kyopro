#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int main(void){
	
	int m, n, tmp;
	int a[100];
	int x[100];
	int* arr;
	
	arr = (int*)calloc(2020, sizeof(int));
	
	scanf("%d", &n);
	
	for(int i = 0; i < n; i++){
		scanf("%d", &x[i]);
		arr[x[i]] = i;
	}
	
	scanf("%d", &m);
	
	for(int j = 0; j < m; j++){
		scanf("%d", &a[j]);
		a[j]--;
		if(x[a[j]] != 2019 && arr[x[a[j]]+1] == 0){
			arr[x[a[j]]] = 0;
			x[a[j]]++;
			arr[x[a[j]]] = a[j];
		}
	}
	int i;
	for(i = 0; i < n; i++){
		printf("%d\n", x[i]);
	}
	
	return (0);
}