// This part was done by the whole team
// The main code: Nguyen Hoang Cam Tu (s3608114)
// Exception handling, testing and final debugging: Dang Khoi (s3694603) and Dong Vu Minh Phuc (s3700622)

package rmit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Shops {
    // shops include code, address, owner, phone, email, and account balance
    private String code;
    private String address;
    private String owner;
    private String phone;
    private String email;
    private String account_balance;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(String account_balance) {
        this.account_balance = account_balance;
    }

    public Shops(String code, String address, String owner, String phone, String email, String account_balance) {
        this.code = code;
        this.address = address;
        this.owner = owner;
        this.phone = phone;
        this.email = email;
        this.account_balance = account_balance;
    }

    public ArrayList addShops(ArrayList c){
        System.out.print("Input Shop Code: ");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine().toUpperCase();
        System.out.print("Input Shop Address: ");
        String address = scanner.nextLine().toLowerCase();
        System.out.print("Input Shop Owner: ");
        String owner = scanner.nextLine().toUpperCase();
        System.out.print("Input Shop Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Input Shop Email: ");
        String email = scanner.nextLine();
        System.out.print("Input Shop Account Balance: ");
        String account_balance = scanner.nextLine();

        Shops add = new Shops();
        add.setCode(code);
        add.setAddress(address);
        add.setOwner(owner);
        add.setPhone(phone);
        add.setEmail(email);
        add.setAccount_balance(account_balance);
        c.add(add);
        return c;

    }

    public ArrayList editShops(ArrayList c){
        System.out.println();
        System.out.print("Please input the Shop ID that you want to edit ");
        Scanner scanner = new Scanner(System.in);
        try {
            int idtoedit = scanner.nextInt() - 1;
            scanner.nextLine();
            Shops edit = (Shops) c.get(idtoedit);
            System.out.print("Shop Code: ");
            code = scanner.nextLine().toUpperCase();
            System.out.print("Shop Address: ");
            address = scanner.nextLine();
            System.out.print("Shop Owner ");
            owner = scanner.nextLine().toUpperCase();
            System.out.print("Shop Phone ");
            phone = scanner.nextLine();
            System.out.print("Shop Email ");
            email = scanner.nextLine().toLowerCase();
            System.out.print("Shop Account Balance ");
            account_balance = scanner.nextLine();

            edit.setCode(code);
            edit.setAddress(address);
            edit.setOwner(owner);
            edit.setPhone(phone);
            edit.setEmail(email);
            edit.setAccount_balance(account_balance);
        }
        catch (Exception ex) {
            System.out.println("Invalid Input. Please try again");
        }
        return c;
    }

    public void viewShops(ArrayList c){
        int id = 0;
        System.out.println("--- The List Of Shops ---");
        Iterator shop =c.iterator();
        while(shop.hasNext()) {
            Object obj=shop.next();
            if(obj instanceof Shops) {
                id++;
                Shops view=(Shops) obj;
                System.out.println("Shop ID: "+ id + " ");
                System.out.println("Shop Code: "+ view.getCode());
                System.out.println("Shop Address: "+ view.getAddress());
                System.out.println("Shop Owner: "+ view.getOwner());
                System.out.println("Shop Phone: "+ view.getPhone());
                System.out.println("Shop Email: "+ view.getEmail());
                System.out.println("Shop Account Balance: "+ view.getAccount_balance());
            }
        }
    }
    public ArrayList deleteShops(ArrayList c) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\t");
            System.out.print("Please input the Shop ID that you want to remove: ");
            int idtodelete = scanner.nextInt() - 1;
            System.out.println("You want to remove the shop ID " + (idtodelete + 1));
            c.remove(idtodelete);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid Input. Please try again");
        }
        return c;
    }

    public Shops(){
        super();
    }
}

