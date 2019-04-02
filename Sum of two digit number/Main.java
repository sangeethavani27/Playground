#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a=n%10;
  n=n/10;
printf("%d",a+n);
  return 0;
}