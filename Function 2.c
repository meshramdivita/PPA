#include<stdio.h>

// Function Defination 
int Addition (int value1,int value2) 
{
    int Result = 0;   // Local  variable 
    Result = Value1 + Value2; // Business logic 
    return Result;
}

int main() // Entry point function
{
    int No1=0 , No2=0;  //  Local variable 

    printf("Enter first number: \n");
    scanf("%d",&No1);

    printf("Enter second number :\n");
    scanf("%d",&No2);

    Ans = Addition (No1,N02);  //Function call

    printf("Addition is :%d\n",Ans);



    return 0;
}