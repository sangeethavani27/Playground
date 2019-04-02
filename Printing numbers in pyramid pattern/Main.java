#include <stdio.h>
int main() {
	int i,n,k,j;
 
  scanf("%d",&n);
  int num=1;
  for(i=1;i<=n;i++)
  {
    for(k=1;k<=n-i;k++)
        {
          printf(" ");
        }
    
        for(j=1;j<=i;j++)
        {
          
          printf("%d ",num);
          ++num;
         
         
         
        }
    
    printf("\n");
  
        }
	return 0;
}