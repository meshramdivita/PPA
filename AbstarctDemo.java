abstract class Arithmatic 
{
    abstract public int Addition(int A,int B);
    abstract public int Substraction (int A,int B);
    public int Multiplication (int A,int B)
    {
        return A*B;
    }
}

class Marvellous extends Arithmatic
{
    public int Addition (int A,int B)
    {
        return A+B;
    }
    public int Substarction (int A,int B)
    {
        return A-B;
    }
} 
class AbstarctDemo
{
    public static void  main(String A[])
    {
        Marvellous obj = new Marvellous ();

        System.out.println(mobj.Addition(11,10));
        System.out.println(mobj.Substarction(11,10));

    }
}