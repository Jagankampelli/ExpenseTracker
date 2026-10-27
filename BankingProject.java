class BankingProjectDemo
{
    public static void main(String args[])
    {
        System.out.println("WELCOME TO OUR DOLKHPUR BRANCH.");
        System.out.println("What type of services do you want?");
        System.out.println("Select the option below");
        int ch=0;
        do {
            System.out.println("1.CREATE NEW ACCOUNT\n2.CREDIT MONEY\n3.DEBIT MONEY\n4.BALANCE\n5.UPDATE PROFILE\n6.EXIT");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    // create func;
                    break;
                case 2:
                    // CREDIT FUNC;
                    break;
                case 3:
                    System.out.println("CURRENTLY WE ARE NOT PROVIDING THE REQUIRED SERVICE");
            }
        }while(ch!=6);
    }
}