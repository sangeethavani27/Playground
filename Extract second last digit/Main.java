#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a=n/10;
  n=a%10;
  printf("%d",n);
  
  return 0;
}