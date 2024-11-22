#include<iostream>
using namespace std;

class Base
{
    public :
       int i ;
    private :
       int j ;
    protected :
       int k ;
    public :
       Base()
       {
        i = 10;
        j = 20;
        k = 30;
       }
       void gun()
       {
        cout<<i<<"\n"; //allowed
        cout<<j<<"\n"; //allowed
        cout<<k<<"\n"; //allowed
       }
};

class Derived : public Base
{
   public :
       void fun()
       {
        cout<<i<<"\n";  //allowed 
        cout<<j<<"\n";  //not allowed
        cout<<k<<"\n";  //allowed 
       }
};

int main()
{
    Base bobj;
    cout<<bobj.i<<"\n";   //Allowed
    cout<<bobj.jj<<"\n";  //not allowed
    cout<<bobj.k<<"\n";   // not allowed

    Derived dobj
    cout<<dobj.i<<"\n";
    cout<<dobj.j<<"\n";
    cout<<dobj.k<<"\n";
    return 0;
}