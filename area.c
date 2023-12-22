#include <stdio.h>
#include <math.h>

int main() {
    char shape;
    float size;
    printf("Enter the shape");
    scanf("%c", &shape);
    printf("Enter the size: ");
    scanf("%f", &size);
    if (shape == 'S') {
        float area = size * size;
        printf("Area of Square = %.2f\n", area);
    } else if (shape == 'C') {
        float area = M_PI * pow(size/2, 2);
        printf("Area of Circle = %.2f\n", area);
    } 
    return 0;
}
