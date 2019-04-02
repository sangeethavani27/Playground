#include <stdio.h>
int main() {
	int n,rem=0,a,x;
  scanf("%d",&x);
  n=x;
  while(n!=0)
  {
    a=n%10;
    rem+=a*a*a;
    n/=10;
  }
  if(rem==x)
  {
  printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
    
	return 0;
}