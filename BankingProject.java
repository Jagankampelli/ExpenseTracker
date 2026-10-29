import java.util.Scanner;
class Account {
    static int count=0;
    String name;
    int age;
    String email;
    String IDPROOF;
    long accNum;
    Account(String x,int y,String z,String a)
    {
        name=x;
        age=y;
        email=z;
        IDPROOF=a;
    }
    public void generateNum()
    {
        accNum=(1000000000);
        accNum+=count;
        count++;
       // return accNum;
    }
    void display()
    {
        System.out.println("NAME:"+name+"AGE:"+age+"EMAIL ID:"+email+"ID PRROF"+IDPROOF);
        System.out.println("ACCOUNT NUMBER="+accNum);
    }
}
class BankingProject
{
    public static void CreateAcc() {
        // FOR EVERY USER THE ACC SHOULD BE PRIMARY ID;
        // TAKE THE DETAILS PERSONAL LIKE AGE NAME EMAIL ID PROOF(AADHAAR PANCARD)
        // constraints ID PRIMARY AND AGE >=18 THATSIT
        Scanner sc=new Scanner(System.in);
        System.out.println("ITS SIMPLE JUST WE NEED YOUR INFORMATION AND SOME TIME");
        String name=sc.nextLine();
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("AGE NOT VALID EXCEPTION:AGE SHOULD BE GREATER THAN 18");
            return ;
        }
        else {
            String email = sc.nextLine();
            String IDPROOF = sc.nextLine();
            Account a1 = new Account(name,age,email,IDPROOF);
         //  long accnum=a1.generateNum();
            System.out.println("ACCOUNT IS CREATED SUCCESFULLY");
            System.out.println("ACCOUNT DETAILS ARE");
            a1.display();
        }
    }
    public static void CREDIT()
    {

    }
    public static void DEBIT()
    {

    }
    public static void UPDATE() {

    }
    public static void DISPLAY(int signal)
    {

    }
    public static void main(String args[])
    {

        System.out.println("WELCOME TO OUR DOLKHPUR BRANCH.");
        System.out.println("What type of services do you want?");
        System.out.println("Select the option below");
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do {
            System.out.println("1.CREATE NEW ACCOUNT\n2.CREDIT MONEY\n3.DEBIT MONEY\n4.BALANCE\n5.UPDATE PROFILE\n6.EXIT");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    // create func;
                    CreateAcc();
                    break;
                case 2:
                    // CREDIT FUNC;
                    break;
                case 3:
                    // DEBIT func;
                    break;
                case 4:
                    // BALANCE FUNC;
                    break;
                case 5:
                    // UPDATE func;
                    break;
                case 6:
                    System.out.println("THANK YOU");
                    //exit
                    break;
                default :
                    System.out.println("CURRENTLY WE ARE NOT PROVIDING THE REQUIRED SERVICE");
            }
        }while(ch!=6);
    }
}