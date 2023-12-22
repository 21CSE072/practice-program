#include<stdio.h>
int main(){
int a[3][3],i,j;
printf("\nenter the elements of the matrix:");
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        scanf("\n%d",&a[i][j]);
    }
}
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        printf("%d\t",a[i][j]);
    }
    printf("\n");
}
}