//JERVIN JOSE HOTEL FOOD BOOKING ONLINE APPLICATION USING JAVA PROGRAM 

import java.util.*;

class ChickenQueen2
{
    public static void main(String[] args) throws Exception
    {//INTERFACE q
        Scanner s=new Scanner(System.in);
        System.out.println("             |i|i|     |i|i|       |l|l|l|");
        Thread.sleep(100);
        System.out.println("             |i|i|     |i|i|       |l|l|l|");
        Thread.sleep(100);
        System.out.println("             |i|i|     |i|i|       |l|l|l|");
        Thread.sleep(100);
        System.out.println("             |i|i|i|i|i|i|i|       |l|l|l|");
        Thread.sleep(100);
        System.out.println("             |i|i|     |i|i|       |l|l|l|");
        Thread.sleep(100);
        System.out.println("             |i|i|     |i|i|       |l|l|l|                                          From :[jervin jose]");
        Thread.sleep(100);
        System.out.println("CHICKEN QUEEN");
        Thread.sleep(1000);
        System.out.print("LOADING.");Thread.sleep(200);System.out.print("."); Thread.sleep(200);System.out.print(".");Thread.sleep(200);System.out.print(".");Thread.sleep(200);System.out.print(".");Thread.sleep(200);System.out.print(".");Thread.sleep(200);System.out.print(".");Thread.sleep(200);System.out.println(".");Thread.sleep(200);
        Thread.sleep(200);
        System.out.println("READY TO EAT WITH YOUR QUEEN");
        Thread.sleep(1000);
        System.out.println(":::::::LETS GO:::::::");
        Thread.sleep(2000);
        //hotel
        System.out.println("*****Select----- the----- Hotel*****");
        System.out.println("(1)..ARABIAN NIGHTS");
        System.out.println("(2)..THALAPAKATTI");
        System.out.println("(3)..EAT AND MEAT");
        System.out.println("(0)For more hotel>>>....");
        int hotel=s.nextInt();

        //hotel selection
        switch(hotel)
        {
            case 1:
            {
                //1st hotel
                System.out.println("THANK YOU FOR SELECTING>>>ARABIAN NIGHTS");
                System.out.println("*****SELECT FOOD ****");
                System.out.println("(1)..CHICKEN BRIYANI");
                System.out.println("(2)..CHICKEN NOODLES");
                System.out.println("(3)..CHICKEN LOLIPOP");
                System.out.println("(4)..ROSE MILK ");
                int food=s.nextInt();
                if(food<5)
                {
                    switch(food)
                    {
                        case 1:
                        {
                            int b1=200;
                            System.out.println("Chicken Briyani: cost(200)");
                            System.out.println("ENTER THE QUANTITY OF CHICKEN BRIYANI");
                            int chickenbriyani=s.nextInt();
                            int Total=(b1*chickenbriyani);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();
                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");

                            }

                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");


                        }
                        break;
                        //CHICKEN NOODLES
                        case 2:
                        {
                            int b2=180;
                            System.out.println("Chicken noodles: cost(180)");
                            System.out.println("ENTER THE QUANTITY OF CHICKEN BRIYANI");
                            int chickenbriyani=s.nextInt();
                            int Total=(b2*chickenbriyani);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();
                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");

                            }

                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                        break;
                        //chicken lolipop
                        case 3:
                        {
                            int b3=120;
                            System.out.println("Chicken lolipop: cost(120)");
                            System.out.println("ENTER THE QUANTITY OF CHICKEN lolipop");
                            int chickenlolipop=s.nextInt();
                            int Total=(b3*chickenlolipop);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();

                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");
                            }
                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                        break;
                        //Rose milk
                        case 4:
                        {
                            int b4=100;
                            System.out.println("Chicken RoseMilk: cost(120)");
                            System.out.println("ENTER THE QUANTITY OF CHICKEN RoseMilk");
                            int chickenRoseMilk=s.nextInt();
                            int Total=(b4*chickenRoseMilk);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();

                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");

                            }
                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                    }
                }
                else
                    System.out.println("YOU HAVE ENTER INVALID NUMBER");
            }
            break;
            case 2:
            {
                System.out.println("THANK YOU FOR SELECTING>>>THALAPAKATTI");
                System.out.println("*****SELECT FOOD ****");
                System.out.println("(1)..CHICKEN TIKKA");
                System.out.println("(2)..Veg NOODLES");
                System.out.println("(3)..HOT CHOCOLATE");
                System.out.println("(4)..BADAM MILK");

                int food=s.nextInt();
                if(food<5)
                {
                    switch(food)
                    {
                        case 1:
                        {
                            int c1=130;
                            System.out.println("Chicken Tikka: cost(200)");
                            System.out.println("ENTER THE QUANTITY OF CHICKEN Tikka");
                            int chickenTikka=s.nextInt();
                            int Total=(c1*chickenTikka);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();
                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");

                            }

                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");

                        }
                        break;
                        //VEG NOODLES
                        case 2:
                        {
                            int c2=90;
                            System.out.println("Veg noodles: cost(90)");
                            System.out.println("ENTER THE QUANTITY OF Veg noodles");
                            int Vegnoodles=s.nextInt();
                            int Total=(c2*Vegnoodles);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();
                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");
                            }
                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                        break;
                        //Hot Chocolate
                        case 3:
                        {
                            int c3=120;
                            System.out.println("Hot Chocolate: cost(220)");
                            System.out.println("ENTER THE QUANTITY OF Hot Chocolate");
                            int Hotchocolate=s.nextInt();
                            int Total=(c3*Hotchocolate);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();

                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");

                            }

                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                        break;
                        //Badam Milk
                        case 4:
                        {
                            int c4=160;
                            System.out.println("Badam Milk: cost(1600)");
                            System.out.println("ENTER THE QUANTITY OF Badam Milk");
                            int BadamMilk=s.nextInt();
                            int Total=(c4*BadamMilk);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();

                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");
                            }
                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                    }

                }
                else
                    System.out.println("YOU HAVE ENTER INVALID NUMBER");


            }
            break;
            case 3:
            {
                System.out.println("THANK YOU FOR SELECTING>>>EAT AND MEAT");
                System.out.println("*****SELECT FOOD ****");
                System.out.println("(1)..CHICKEN BURGER");
                System.out.println("(2)..Veg PIZZA");
                System.out.println("(3)..TOMATO PANEER PIZZA");
                System.out.println("(4)..YOGURT");
                int food=s.nextInt();
                if(food<5)
                {
                    switch(food)
                    {
                        case 1:
                        {
                            int d1=175;
                            System.out.println("Chicken Burger: cost(175)");
                            System.out.println("ENTER THE QUANTITY OF CHICKEN Burger");
                            int chickenBurger=s.nextInt();
                            int Total=(d1*chickenBurger);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();
                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }

                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");


                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");

                            }

                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");

                        }
                        break;
                        //VEG Pizza
                        case 2:
                        {
                            int d2=85;
                            System.out.println("Veg Pizza: cost(85)");
                            System.out.println("ENTER THE QUANTITY OF Veg Pizza");
                            int VegPizza=s.nextInt();
                            int Total=(d2*VegPizza);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();
                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");

                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");
                            }
                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                        break;
                        //Tomato paneer Pizza
                        case 3:
                        {
                            int d3=245;
                            System.out.println("Tomato Paneer Pizza: cost(245)");
                            System.out.println("ENTER THE QUANTITY OF Tomato Paneer Pizza");
                            int TomatoPaneerP=s.nextInt();
                            int Total=(d3*TomatoPaneerP);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();
                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");
                            }
                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");
                        }
                        break;
                        //YOGURT
                        case 4:
                        {
                            int d4=50;
                            System.out.println("YOGURT: cost(50)");
                            System.out.println("ENTER THE QUANTITY OF YOGURT");
                            int YOGURT=s.nextInt();
                            int Total=(d4*YOGURT);
                            System.out.println(Total);
                            System.out.println("Enter (1) to pay/n(2) cancel");
                            int money=s.nextInt();

                            if(money==1)
                            {
                                System.out.println("(1)CASH ON DELIVERY\n(2)GOOGLE PAY\n(3)DEBIT CARD\n(4)INTERNET BANKING");
                                int payment=s.nextInt();

                                if(payment==1)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==2)
                                {
                                    System.out.println("enter the mobile number");
                                    int mobile=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY THE BILL PAID");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else if(payment==3)
                                {
                                    System.out.println("enter the card number");
                                    int card=s.nextInt(16);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING...OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");

                                }
                                else if(payment==4)
                                {
                                    System.out.println("enter the user id");
                                    int userid=s.nextInt(10);
                                    Thread.sleep(3000);
                                    System.out.println("ENTER THE OTP");
                                    Thread.sleep(100);
                                    System.out.print("7");
                                    Thread.sleep(100);
                                    System.out.print("5");
                                    Thread.sleep(100);
                                    System.out.print("6");
                                    Thread.sleep(100);
                                    System.out.println("7");
                                    Thread.sleep(100);
                                    int otp=s.nextInt();
                                    int original=7567;
                                    System.out.println("VERIFYING....OTP...");
                                    if(otp==original)
                                    {
                                        System.out.println("<<<OTP VERIFIED SUCCESFULLY>>>");
                                        System.out.println("SUCCESSFULLY PAID THE BILLED");
                                        Thread.sleep(2000);
                                        System.out.println("YOUR ORDER HAVE BEEN TAKEN...\nCURRENTLY COOKING..");
                                    }
                                    else
                                        System.out.println("ENTERED OTP INVALID");
                                }
                                else
                                    System.out.println("INVALID NUMBER");
                            }

                            else if(money==2)
                                System.out.println("YOU HAVE DECLINED THE PAYMENT");
                            else
                                System.out.println("YOU HAVE ENTERED INVALID NUMBER");

                        }
                    }

                }
                else
                    System.out.println("YOU HAVE ENTER INVALID NUMBER");
            }
            break;
            case 0:
                System.out.println("SORRY THERE IS NO HOTEL AVAILABLE OTHER THAN LISTED ABOVE");

        }
    }
}
 
