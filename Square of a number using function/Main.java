#include<stdio.h>
int sq_of_digit(int m)
{
  int a;
  a=m*m;
  return a;
}
int main() {
   int n,b;
  scanf("%d",&n);
  b=sq_of_digit(n);
  n=b;

printf("%d",n);

  
   return 0;
}