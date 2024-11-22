#include<iostream>
using namespace std;

int main()
{
    int Arr[5]; // static memory

    int *ptr = NULL;

    //step1 allocate the memory

    ptr = new int [5];
    // step2 : use the memory
    // logic 
    // step3 : Dealoocate the memory
    delete []ptr;

    return 0;
}