#include<iostream>
using namespace std;

class Demo
{
    public:
    int Addition (int A , int B)
    {
       return A+B; 
    }
    int Addition (double A, double B)
    {
        return A+B;
    }
    int Addition (int A, int B, int C)
    {
        return A+B+C;
    }
};

int main()
{
    class Demo obj;
    cout<<"Addition of :"obj A+B<<"\n";
    cout<<"Addition  of :"obj A+B<<"\n";
    cout<<"Addition of : "obj A+B+C <<"\n";
    return 0;

}

