    #include <stdio.h>
    #include <stdlib.h>
    #include <math.h>
    #include <limits.h>
     
     
    int main(void){
    	
    	long long n0, a, res = 1;
    	scanf("%lld", &a);
    	
    	scanf("%lld", &n0);

		long long limit = ((long long)pow(n0, 1.0/a)) * 2;
		
				
		if(n0 == 1 && a > limit){
			printf("1\n");
			return 0;
		}
		
		if(a == 1){
			printf("%lld", n0);
			return 0;
		}
		
        long long   n;   // 整数
        long long   ns=2;   // 素因数
        long long   j;      // 乗数
    	long long i = 0;
    	
    	//printf("%lld\n", n0%3);
    	
        for( n=n0,ns=2; limit>=ns; ns++ )
          {
            for( j=0; n%ns==0; j++ )            // 割り切れる間繰り返す
             {
               n/=ns;
             }
    		 
    		 //printf("%d:%d\n", ns, j);
    		 
            if ( j==0 ) continue;               // 1回も割り切れなかった
			
			if(a <= j){
    			res *= ns;
    	 	}
         }
    	 printf("%lld\n", res);
    	 
    	return 0;
    }