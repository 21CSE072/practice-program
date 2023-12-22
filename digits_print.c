#include<stdio.h>
#include<ctype.h>
#include<string.h>
int main(){
char name[10]="a3b5";
int len=0;
len=strlen(name);
int i=0;
while(i<len)
{
    if(isdigit(name[i]))
    {
        int count=name[i]-'0';
        for(int j=0;j<count;j++)
        {
            printf("%c",name[i-1]);
        }
    }
    i++;
}

}