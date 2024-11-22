#include<stdio.h>
int main() // entry point function 
{
    float Mark1 = 78.98; // 4 byte
    float Mark2 = 90.99; // 4 byte 
    float Mark3 = 67.89; // 4 byte 
    float Mark4 = 56.90; // 4 byte
    float Mark5 = 87.56; // 4 byte

    // Mark is an dimentional array which contain 5 element
    // each element is of type float

    float Mark[5] = {78.98,90.99,67.89,56.90,87.56};
    return 0;
}