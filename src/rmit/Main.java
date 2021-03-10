// RMIT Saigon South Campus
// COSC2081 - Programming 1
// The Assignment 1

// Team Members:
// Nguyen Hoang Cam Tu (s3608114)
// Dang Khoi (s3694603)
// Dong Vu Minh Phuc (s3700622)


// This part was done by the whole team
// The main code: Nguyen Hoang Cam Tu (s3608114)
// Exception handling, testing and final debugging: Dang Khoi (s3694603) and Dong Vu Minh Phuc (s3700622)

package rmit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String[] general_array = {"Vietlott Menu", "--------------------------------", "Please enter your choice (1 - 5)",
                    "1 - Customers", "2 - Vietlott Shops","3 - Buy a ticket", "4 - Lottery Draws", "5 - Exit"};  //Menu
            for (String aGeneral_array : general_array) {
                System.out.println(aGeneral_array);
            }
            int choice = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        choice1();
                        break;
                    case 2:
                        choice2();
                        break;
                    case 3:
                        choice3();
                        break;
                    case 4:
                        choice4();
                        break;
                    case 5:
                        System.out.println("Good Bye");
                        System.out.println("Have a nice day");
                        return;
                    default:
                        System.out.println("Invalid Input. Please try again");
                }
            }
            catch(Exception ex){
                System.out.println("Invalid Input. Please try again");
            }
        }
    }
    public static void choice1() {
        ArrayList<Customers> customers = new ArrayList();
        while (true) {
            Customers cus = new Customers();
            System.out.println("\t");
            System.out.println("Please enter your choice (1 - 5)");
            String[] array = {"1 - Add customers", "2 - Edit customers", "3 - View customers", "4 - Delete customers", "5 - Return to the Menu"};
            for (String anArray : array) {
                System.out.println(anArray);
            }
            Scanner scanner = new Scanner(System.in);
            try {
                int cus_choice = scanner.nextInt();
                switch (cus_choice) {
                    case 1:
                        customers = cus.addCustomers(customers);
                        break;
                    case 2:
                        cus.viewCustomers(customers);
                        customers = cus.editCustomers(customers);
                        break;
                    case 3:
                        cus.viewCustomers(customers);
                        break;
                    case 4:
                        cus.viewCustomers(customers);
                        customers = cus.deleteCustomers(customers);
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid Input. Please try again");
                }
            }
            catch(Exception ex){
                System.out.println("Invalid Input. Please try again");
            }
        }
    }
    public static void choice2() {
        ArrayList<Shops> shops = new ArrayList<>();
        while (true) {
            Shops sh = new Shops();
            System.out.println("\t");
            System.out.println("Please enter your choice (1 - 5)");
            String[] array = {"1 - Add shops", "2 - Edit shops", "3 - View shops", "4 - Delete shops", "5 - Return to the Menu"};
            for (String anArray : array) {
                System.out.println(anArray);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                int sh_choice = scanner.nextInt();
                switch (sh_choice) {
                    case 1:
                        shops = sh.addShops(shops);
                        break;
                    case 2:
                        sh.viewShops(shops);
                        shops = sh.editShops(shops);
                        break;
                    case 3:
                        sh.viewShops(shops);
                        break;
                    case 4:
                        sh.viewShops(shops);
                        shops = sh.deleteShops(shops);
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid Input. Please try again");
                }
            }
            catch(Exception ex){
                System.out.println("Invalid Input. Please try again");
            }
        }
    }
    public static void choice3() {
        System.out.println("Would you like to purchase a ticket?");
        while (true) {
            String[] array = {"1 - Yes", "2 - No - Back to main menu"};
            for (String anArray : array) {
                System.out.println(anArray);
            }

            try{
                Scanner scanner = new Scanner(System.in);
                int draw_choice = scanner.nextInt();

                System.out.println("Your choice is: " + draw_choice);
                switch (draw_choice) {
                    case 1:
                        int[] YourNumber = Draws.arrayGen(46);
                        System.out.println("Thank you for your purchase. Your numbers are");
                        System.out.println(Arrays.toString(YourNumber));
                        System.out.println("Would you like to purchase another ticket?");
                        break;
                    case 2:
                        System.out.println("Good Bye");
                        return;
                    default:
                        System.out.println("Invalid Input. Please try again");
                }
            }
            catch (Exception ex){
                System.out.println("Invalid Input. Please try again");
            }
        }
    }
    public static void choice4() {
        while (true) {
            System.out.println("Begin the lottery simulation?");
            String[] array = {"1 - With numbers from 0 to 45", "2 - With numbers from 0 to 5 (quick testing)", "3 - Return to the Menu"};

            for (String anArray : array) {
                System.out.println(anArray);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                int draw_choice = scanner.nextInt();

                System.out.println("Your choice is: " + draw_choice);
                switch (draw_choice) {
                    case 1:
                        Draws.draw(46);
                        break;
                    case 2:
                        Draws.draw(6);
                        break;
                    case 3:
                        System.out.println("Good Bye");
                        return;
                    default:
                        System.out.println("Invalid Input. Please try again");
                }
            }
            catch(Exception ex){
                System.out.println("Invalid Input. Please try again");
            }
        }
    }
}