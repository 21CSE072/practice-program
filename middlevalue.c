#include <stdio.h>
int main()
{
    int x, y, z;
    printf("enter the value of x");
    scanf("%d", &x);
    printf("enter the value of y");
    scanf("%d", &y);
    printf("enter the value of z");
    scanf("%d", &z);
if((x>y&&x<z)||(x>z&&x<y))
{
    printf("1");
}
else if((y>x&&y<z)||(y>z&&y<z))
{
    printf("2");
}
else
{
    printf("3");
}
}
