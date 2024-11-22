interface RBI
{
    int TaxRate = 30;
    public float CalculateIntrest();
}
class SBI implements RBI{
    public float CalculateIntrest()
    {
        return 8.2f;
    }
}

class InterfaceDemo
{
    public static void Main(String A[])
    {
        System.out.println("Tax rate is : "+RBI.TaxRate);
        SBI sobj = new SBI ();
        BOM bobj = new BOM();

        System.out.println("Intreset rate of SBI is:"+sobj)
    }
}