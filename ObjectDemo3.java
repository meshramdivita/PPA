class Demo
{

    public Demo()
    {
        System.out.println("Indside constructor");
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}

class ObjectDemo3
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        obj = null;
        System.gc();
    }
}    