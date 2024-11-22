class Marvellous
{
    public int A;      // acess specifier 
    protected float B; // access specifier 
    private int C;      // access specifier 

    public Marvellous()
    {
        A = 10;
        B = 10.10f;
        C = 20;
    } 
    void Display()       // default access specifier 
    {
        int i = 11;
        System.out.println("Value of i is :"+1);
    }
}

class Demo
{
    public static void main (String A[])
    {
        Marvellous mobj = new Marvellous();

        mobj.Display();
    }
}