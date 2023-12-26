#include <stdio.h>
int main()
{
    int n=9;
    int a[9]={1, 3, 5, 5, 5, 5, 7, 123, 125};
    func(a,n);
    return 0;
}
int func(int a[],int n)
{
    int i=0,x=7;
    while(i<n)
    {
        if(a[i]==x)
        {
            printf("\nfirst occurrence of %d at index %d",x,i);
            break;
        }
        i++;
    }
    int j=i+1,last=i-1+1;
    while(j<n)
    {
        if(a[j]==x)
        {
            last=last+1;
        }
        j++;
    }
    printf("\nlast occurrence of %d at index %d",x,last);
    
}
