#include <stdio.h>
void frequency(int arr[],int n)
{
    int i=0;
    while(i<n)
    {
        int count=1;
        while(i<n-1&&arr[i]==arr[i+1])
        {
            count=count+1;
            i++;
        }
        if(count>1)
        {
            printf("frequency of %d is %d\n",arr[i],count);
        }
        i++;
    }
}
int main()
{
    int n;
    printf("enter the size of the array");
    scanf("%d",&n);
    printf("enter the elements of the array");
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    frequency(arr,n);
    return 0;
}
