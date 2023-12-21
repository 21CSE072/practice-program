#include <stdio.h>
#include <string.h>
#include <stdbool.h>
bool isSpecialChar(char ch) {
    char specialChars[] = "!@#$%^&*()-+";
    for (int i = 0; i < strlen(specialChars); i++) {
        if (ch == specialChars[i]) {
            return true;
        }
    }
    return false;
}
void check(char password[]) {
    int length = strlen(password);
    bool Lower = false, Upper = false, Digit = false, Special = false;

    for (int i = 0; i < length; i++) {
        char ch = password[i];
        if ('a' <= ch && ch <= 'z') {
            Lower = true;
        } else if ('A' <= ch && ch <= 'Z') {
            Upper = true;
        } else if ('0' <= ch && ch <= '9') {
            Digit = true;
        } else if (isSpecialChar(ch)) {
            Special = true;
        }
    }
    if (length >= 8 && Lower && Upper && Digit && Special) {
        printf("Password is strong.\n");
    } else {
        printf("Password is not strong.\n");
    }
}
int main() {
    char password[50];
    printf("Enter the password: ");
    scanf("%s", password);
    check(password);
    return 0;
}
