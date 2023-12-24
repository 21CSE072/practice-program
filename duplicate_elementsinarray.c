#include <stdio.h>
int main()
{
   int n;
   printf("enter the size of the array");
   scanf("%d",&n);
   int a[n];
   printf("enter the elements of the array");
   for(int k=0;k<n;k++)
   {
       scanf("%d",&a[k]);
   }
   for(int i=0;i<n-1;i++)
   {
       int j=i+1;
       while(j<n)
       {
           if(a[i]==a[j])
           {
               printf("duplicate elements are %d",a[i]);
               break;
           }
           j++;
       }
       
   }
}
