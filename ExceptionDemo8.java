import java.io.*;

class ExceptionDemo8
{
    public static void main(String A[]) throws IOException
    {

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter yor name:");
        String name = bobj.readLine();

        System.out.println("Enter your age:");
        int Age = Integer.parseInt(bobj.readLine());

        System.out.println("your name:"+name);
        System.out.println("your age :"+Age);
    }
}
