#include <stdio.h>
#include <stdlib.h>
int sum(int a[],int n)
{
    int x=16,found;
    for(int i=0;i<n-1;i++)
    {
        int j=i+1;
        while(j<n)
        {
        if(a[i]+a[j]==x)
        {
           found=1;
           break;
        }
        j++;
        }
    }
    if(found==1)
    {
        printf("yes");
    }
    else{
        printf("No there are no two elements has sum %d",x);
    }
 }
int main() {
    int n;
    printf("enter the size of array");
    scanf("%d", &n);
    int a[n];
    printf("enter the elements of the array");
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
  }
   sum(a,n);
   return 0;
}
