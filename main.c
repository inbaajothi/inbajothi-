#include <stdio.h>
#include <stdlib.h>

int main()
{
    int rows,i,j,number = 1;
    printf("Enter the number of  rows:");
    scanf("%d", &rows);
    for(i = 1; i <= rows; i++) {
            for(i = 1; j <= i; ++j) {
                printf("%d", number);
                ++number;
            }
            printf("\n");
    }
    return 0;


}
