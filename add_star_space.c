#include <stdio.h>
#include <string.h>
void sent(char sentence[], int screenLength) {
    int length = strlen(sentence);
    int spacesToInsert = screenLength - length;
    int spaceCount = 0;
    for (int i = 0; i < length; i++) {
        if (sentence[i] == ' ') {
            spaceCount++;
        }
    }
    int spacesBetweenWords = spaceCount > 0 ? spacesToInsert / spaceCount : 0;
    for (int i = 0; i < length; i++) {
        if (sentence[i] == ' ') {
            for (int j = 0; j < spacesBetweenWords; j++) {
                printf("*");
            }
        }
        printf("%c", sentence[i]);
    }
    printf("\n");
}
int main() {
    char sentence[] = "Welcome to Zoho Corporation";
    int screenLength = 34;
    printf("\nSentence = %s\nScreen length = %d\n", sentence, screenLength);
    sent(sentence, screenLength);

    return 0;
}
