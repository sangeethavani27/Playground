#include<stdio.h>
int main()
{
  int n,a;
  scanf("%d",&n);
  a=n%10;
  n=n/100;
  int sum=a+n;
  printf("%d",sum);
  return 0;
}