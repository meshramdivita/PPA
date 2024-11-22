import java.net.*;
import java.io.*;
class Client
{
    public static void main(String Arg[])throws Exception
    {
        System.out.println("Client application is ruuning....");
        



        Socket sobj =new Socket ("local hots ..",2100);
        System.out.println("Connection established with the server...");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStream(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str1 , str2 ; 
        System.out.println("marvellous chat Massanger application started...");
        While(!(str1=br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2 = br2.readLine();
            System.out.println("Enter the message for server :");
            System.out.println("Server sats:"+str2);
        }
        System.out.println("Thank you for using Marvellous chat Application ..");
    }
}