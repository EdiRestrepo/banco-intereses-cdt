import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static  boolean flag = true;
    private static int option;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        do{
            menu();
            option = captureInt();
            input.nextLine();
            flag = evaluateOption(option);
        }while (flag == true);
        System.exit(0);
    }

    private static void menu(){
        System.out.println("**************************************************************");
        System.out.println("    Select the bank in whick you are going to make the CDT ");
        System.out.println("    1. BancoPe:         2.50%   interest -  1.3% savings tax");
        System.out.println("    2. BancaAmigó:      2.47%   interest -  1.7% savings tax");
        System.out.println("    3. CoperativaBC:    2.43%   interest -  1.3% savings tax");
        System.out.println("    0. Exit the App");

    }

    private static int captureInt(){
        return  input.nextInt();
    }

    private static double captureDouble(){
        return  input.nextDouble();
    }

    private static boolean evaluateOption(int option) throws IOException {
        switch (option){
            case 1:
                System.out.println("Enter the amount of money to invest");
                double money = captureDouble();
                input.nextLine();
                System.out.println("Enter the number of days of the CDT");
                double days = captureDouble();
                input.nextLine();
                BancoPe banco = new BancoPe(money, days);
                banco.printInformation();
                System.in.read();
                return true;
            case 2:
                System.out.println("Enter the amount of money to invest");
                double money2 = captureDouble();
                input.nextLine();
                System.out.println("Enter the number of days of the CDT");
                double days2 = captureDouble();
                input.nextLine();
                BancoAmigo banco2 = new BancoAmigo(money2, days2);
                banco2.printInformation();
                System.in.read();
                return true;
            case 3:
                System.out.println("Enter the amount of money to invest");
                double money3 = captureDouble();
                input.nextLine();
                System.out.println("Enter the number of days of the CDT");
                double days3 = captureDouble();
                input.nextLine();
                CoperativaBC banco3 = new CoperativaBC(money3, days3);
                banco3.printInformation();
                System.in.read();
                return true;
            case 0:
                return false;
            default:
                System.out.println("wrong choice");
                System.out.println("press enter to return to the main menu");
                System.in.read();
                return true;
        }
    }
}