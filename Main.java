public class Main
{// Track expenses of the USER
public static void main(String args[])
        {
        int n;
        Scanner sc=new Scanner(System.in);
        do {
        //print MENU
        int ch=menu();
        //access the option and perform it
        selectchoic(ch);
        }while(ch!=0);
        }
}