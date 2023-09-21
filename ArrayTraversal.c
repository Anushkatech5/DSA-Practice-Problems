
// C program to traverse the array
 
#include <stdio.h>
 
// Function to traverse and print the array
void printArray(int* arr, int n)
{
    int i;
 
    printf("\nArray: ");
    for (i = 0; i < n; i++) 
    {
        printf("%d\n ", arr[i]);
    }
}
 
int main()
{
    int arr[] = { 2, -1, 5, 6, 0, -3 };
    int n = sizeof(arr) / sizeof(arr[0]);
 
    printArray(arr, n);
 
    return 0;
}
