#include<stdio.h>
int natural(int m)
{
  int i,sum=0;
  for(i=1;i<=m;i++)
  {
    sum+=i;
  }
  return sum;
}
    
int main() {
    int n,b;
  scanf("%d",&n);
  b=natural(n);
  printf("%d",b);
  
  	return 0;
}