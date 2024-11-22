#include<iostream>
using namespace std;
class Demo
{
    public:
       int A;
    private :
       int B;
    public :
        Demo()
        {
            A=11;
            B=21;
        }   
        void Fun()
        {
            cout<<"Vaule of A:"<<A<<"\n";
            cout<<"Value of B:"<<B<<"\n";
        }    
};

int main()
{
    Demo obj;
    obj.Fun();
    cout<<"Value of A :" << obj.A<<"\n";
    cout<<"Vaule of B :"<< obj.B<<"\n";

    return 0;
}