#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int	divisors_count( int	a ){
	struct detail {
		static int	callback( int	a, int	n, int	b ){
			int	result = 0;
			if( n <= b ){
				if( !( a % n )){
					if( n > 1 ){
						//debug_printf( ", " );
					}
					//debug_printf( "(%d x %d)"), n, a / n );
					++result;
					if( n*n != a ){
						++result;
					}
					result += callback( a, n+1, a / (n+1));
				}
				else{
					result = callback( a, n+1, b );
				}
			}
			return	result;
		}
	};
	return	detail::callback( a, 1, a );
}
long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
        if (n & 1) res = res * a % mod;
        a = a * a % mod;
        n >>= 1;
    }
    return res;
}

int main(void){
	
	
	printf("%d\n",modpow(3,11,1000000007));
	
	return 0;
}