#include <stdio.h>
void Print(int number[], int size) {
    int carry = 1;
    for (int i = size - 1; i >= 0; i--) {
        int sum = number[i] + carry;
        number[i] = sum % 10;
        carry = sum / 10;
    }
    printf("a[]=[");
    if (carry > 0) {
        printf("%d, ", carry);
    }
    for (int i = 0; i < size; i++) {
        printf("%d", number[i]);
        if (i < size - 1) {
            printf(", ");
        }
    }
    printf("]\n");
}
int main() {
    int largeInteger[] = {9,9,9};
    int size = sizeof(largeInteger) / sizeof(largeInteger[0]);
    Print(largeInteger, size);
    return 0;
}
