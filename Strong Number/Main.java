#include <stdio.h>
int main() {
	int n,x,a,fact,i,sum=0;
  scanf("%d",&x);
  n=x;
 while(n!=0)
  {
   a=n%10;
   fact = 1;
        for(i=1; i<=a; i++)
        {
            fact = fact * i;
        }

        /* Add factorial to sum */
        sum = sum + fact;

        n = n/ 10;
 }
  if(sum==x)
  {
  printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}