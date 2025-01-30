import java.util.Scanner;

public class Coffemachine{
    public static void main(String args[]){
        int ch=1,choice1=0,choice2=0,ch2=1, lattecount=0,cappuccinocount=0,espressocount=0;
        int Maxwater=5000, Maxmilk=5000,Maxsugar=5000,Maxcoffee=2000,Maxcup=50;
        int water=50, milk=200, sugar=10,lcoffee=5,capcoffee=7,excoffee=10,cup=1;
        int Totalbill=0, latteprice=90,cappuccinoprice=110,espressoprice=150;
        
            while (ch2==1) 
            {
                
            
            System.out.println("***Welcom to JK's cafe***");
            System.out.println(" 1)  Bye");
            System.out.println(" 2) Fill");
            Scanner s=new Scanner (System.in);
            System.out.println("Enter the choice=");
            choice1=s.nextInt();
            switch (choice1) {
                case 1:
                while (ch==1) {
                    
                    choice2=0;
                System.out.println("********************************");    
                System.out.println("     ***Menue***");
                System.out.println("1)latte");
                System.out.println("2)cappuccino");
                System.out.println("3)espresso");
                System.out.println("4)bill");
                System.out.println("Enter the choice=");
                choice2=s.nextInt();


                switch (choice2) {
                    case 1:
                        System.out.println("Enter the quantity u want=");
                        lattecount=s.nextInt();
                        Maxwater-=(lattecount*water);
                        Maxmilk-=(lattecount*milk);                     
                        Maxcoffee-=(lattecount*lcoffee);
                        Maxsugar-=(lattecount*sugar);
                        Maxcup-=(lattecount*cup);
                        Totalbill+=(lattecount*latteprice);
                        break;
                    case 2:
                    System.out.println("Enter the quantity u want=");
                    cappuccinocount=s.nextInt();
                    Maxwater-=(cappuccinocount*water);
                    Maxmilk-=(cappuccinocount*milk);                     
                    Maxcoffee-=(cappuccinocount*capcoffee);
                    Maxsugar-=(cappuccinocount*sugar);
                    Maxcup-=(cappuccinocount*cup);
                    Totalbill+=(cappuccinocount*cappuccinoprice);
                   

                    break;
                    case 3:
                    System.out.println("Enter the quantity u want=");
                    espressocount=s.nextInt();
                    Maxwater-=(espressocount*water);
                    Maxmilk-=(espressocount*milk);                     
                    Maxcoffee-=(espressocount*excoffee);
                    Maxsugar-=(espressocount*sugar);
                    Maxcup-=(espressocount*cup);
                    Totalbill+=espressocount*espressoprice;                 

                    break;
                    case 4:
                    System.out.println("***********************************************************");
                    System.out.println("total quntity of latte=   "+lattecount);
                    System.out.println("total quntity of cappuccinocount=   "+cappuccinocount);
                    System.out.println("total quntity of espresso=   "+espressocount);
                    System.out.println("************************************************************");
                    System.out.println("Total bill to be paid=   "+Totalbill);
                    System.out.println("***********************************************************");
                    break;

                
                    default:
                    System.out.println("invalid input!!");
                        break;
                }
                System.out.println("Press 1 to add other item\n Press 0 to go to main Menue");
                ch=s.nextInt();

            }
                
                    break;
                case 2: 
                System.out.println("********************************************************************");    
                System.out.println("Current amount of ingrediants in machine=");
                    System.out.println("water="+Maxwater+" ml");
                    System.out.println("Milk="+Maxmilk+" ml");
                    System.out.println("coffee="+Maxcoffee+" g");
                    System.out.println("Sugar="+Maxsugar+" g");
                    System.out.println("cup="+Maxcup+"Untits");
                    System.out.println("*********************************************************************");
                    System.out.println("ingridiants required to fill the machine=");
                    System.out.println("water="+(5000-Maxwater)+"ml");
                    System.out.println("Milk="+(5000-Maxmilk)+" ml");
                    System.out.println("coffee="+(2000-Maxcoffee)+" g");
                    System.out.println("Sugar="+(51000-Maxsugar)+" g");
                    System.out.println("cup="+(50-Maxcup)+"Untits");
                    break;
            
                default:
                System.out.println("invalid input");
                    break;
            }
            System.out.println("Do you want to continue: \n Press 1 for yes and 0 for no");
            ch2=s.nextInt();
            }

    }
}