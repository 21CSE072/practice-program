#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int min = 0;
    for (int i = 0; i < n - 1; i++) {
        if (arr[min] < arr[i + 1]) {
            min = i + 1;
        }
    }
    int max = arr[min];
    int min1 = (min == 0) ? 1 : 0;  
    for (int i = 0; i < n - 1; i++) {
        if (arr[min1] < arr[i + 1] && arr[i + 1] != max) {
            min1 = i + 1;
        }
    }
    int max2 = arr[min1];
    printf("%d", max2);
    return 0;
}
