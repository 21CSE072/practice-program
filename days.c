#include <stdio.h>
int main() {
    int totaldays;
    printf("Enter the total number of days: ");
    scanf("%d", &totaldays);
    int years = totaldays / 365;
    int remainingdays = totaldays % 365;
    int weeks = remainingdays / 7;
    remainingdays = remainingdays % 7;
    printf("Number of Years: %d\n", years);
    printf("Number of Weeks: %d\n", weeks);
    printf("Number of Days: %d\n", remainingdays);

    return 0;
}
