#include <stdio.h>
#include <math.h>
int main()
{
    int deg,x,sum=0;
    printf("enter degree:");
    scanf("%d",&deg);
    printf("enter the coefficients:");
    int cof[deg+1];
    for(int i=0;i<deg+1;i++){
         scanf("%d",&cof[i]);
    }
    printf("enter x:");
    scanf("%d",&x);
    for(int i=0;i<deg+1;i++){
       sum=sum+cof[i]*pow(x,deg-i); 
    }
    printf("%d",sum);
    return 0;
}