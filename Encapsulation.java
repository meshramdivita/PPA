class Arithematic
    {
        public int No1;
        public int No2;

        public Arithematic()
        {
            System.out.println("Inside defalut constructor");
            this.No1=0;
            this.No1=0;
        }

        public Arithematic(int A,int B)
        {
            System.out.println("Inside parametrised constructor");
            this.No1=A;
            this.No2=B;
        }

        public int Addition ()
        {
            int Ans = 0;
            Ans = this.No1+this.No2;
            return Ans;
        }

        public int Substraction()
        {
            int Ans = 0;
            Ans = this.No1-this.No2;
            return Ans;
        }
    }
class Encapsulation
{
    public static void main(String Arr[])
    {
        System.out.println("Inside main function");

        Arithematic aobj1 = new Arithematic();
        Arithematic aobj2 = new Arithematic(10,11);

               // function mdla local veriable ahe 
    }

}