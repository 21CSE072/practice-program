#include<stdio.h>
#include <stdbool.h>
#include<string.h>
int main() {
int n;
printf("enter the size of the array");
scanf("%d",&n);
int a[n];
printf("enter the elements of the array");
for(int j=0;j<n;j++)
{
    scanf("%d",&a[j]);
}
int jump=0;
for(int i=0;i<6;i++)
{
    if(a[i]!='0')
    {
        int j=0;
        while(j<a[i])
        {
            jump=jump+1;
            j++;
        }
    }
if(jump==n-1)
{
   printf("it is reached last element");
}
    i=jump-1;
}
   return 0;
}
