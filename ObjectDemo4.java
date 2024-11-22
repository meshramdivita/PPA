class Student implements Cloneable // class student extends object implements Clonable
{
    public String name;
    public int Age ;
    public int Marks;

    public Student (String A, int B , int C)
    { 
        this .name = A;
        this .Age = B;
        this .Marks = C;
    }
        
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}

class ObjectDemo4
{
    public static void main(String A[])
    {
         Student sobj = new Student ("Sagar",21,89);
         Student sobjX = (Student)sobj.clone(); // copy bnvli


        
        System.out.println("name is :"+sobj.name);
        System.out.println("Age is :"+sobj.Age);
        System.out.println ("Marks is :"+sobj.Marks);



        System.out.println("name is :"+sobj.name);
        System.out.println("Age is :"+sobj.Age);
        System.out.println ("Marks is :"+sobj.Marks);



    }
}