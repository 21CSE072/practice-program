#include<stdio.h>
#include<string.h>
int main() {
    char s[30] = "anagram"; 
    char t[30] = "nagaram";
    int count=0;
    int len=strlen(s);
    int len1=strlen(t);
    if(len!=len1){
         printf("not a anagram");
    }
    else{
    for(int i=0;i<len;i++)
    {
        int j=0;
        while(j<len)
        {
            if(s[i]==t[j])
            {
                count=count+1;
                break;
            }
            j++;
        }
    }
    printf("%d\n",count);
    printf("%d\n",len);
    if(count==len)
    {
        printf("it is anagram");
    }
    else{
        printf("it is not a anagram");
    }
    }
   return 0;
}
