#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n=6;
    int odd[10],even[10];
    int a[6]={10,3,5,12,17,22};
    int j=0,k=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]%2==0)
        {
            odd[j]=a[i];
            j=j+1;
        }
        else
        {
            even[k]=a[i];
            k=k+1;
        }
    }
    printf("odd array is[");
    for(int m=0;m<j;m++)
    {
        printf("\t%d",odd[m]);
    }
    printf("]");
    printf("\neven array is[");
    for(int m=0;m<k;m++)
    {
        printf("\t%d",even[m]);

    }
    printf("]");
    return 0;
}