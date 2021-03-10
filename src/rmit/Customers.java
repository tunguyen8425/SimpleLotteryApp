// This part was done by the whole team
// The main code: Nguyen Hoang Cam Tu (s3608114)
// Exception handling, testing and final debugging: Dang Khoi (s3694603) and Dong Vu Minh Phuc (s3700622)

package rmit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Customers {
    private String name;
    private String email;
    private String address;
    private String birthday;
    private String phone;

    public Customers(String name, String email, String address, String birthday, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList addCustomers(ArrayList c){
        // input customers information
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Customer Name: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.print("Input Customer Email: ");
        String email = scanner.nextLine();
        System.out.print("Input Customer Address: ");
        String address = scanner.nextLine().toLowerCase();
        System.out.print("Input Customer Birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Input Customer Phone: ");
        String phone = scanner.nextLine();

        Customers add = new Customers();
        add.setName(name);
        add.setEmail(email);
        add.setAddress(address);
        add.setBirthday(birthday);
        add.setPhone(phone);
        c.add(add);
        return c;
    }

    public ArrayList editCustomers(ArrayList c) {
        try {

            System.out.print("The ID of customer you want to edit is: ");
            Scanner scanner = new Scanner(System.in);
            int idtoedit = scanner.nextInt() - 1;
            scanner.nextLine();
            Customers edit = (Customers) c.get(idtoedit);

            System.out.print("Customer Name: ");
            String name = scanner.nextLine().toUpperCase();
            System.out.print("Customer Email: ");
            String email = scanner.nextLine();
            System.out.print("Customer Address: ");
            String address = scanner.nextLine().toLowerCase();
            System.out.print("Customer Birthday: ");
            String birthday = scanner.nextLine();
            System.out.print("Customer Phone: ");
            String phone = scanner.nextLine();
            edit.setName(name);
            edit.setEmail(email);
            edit.setAddress(address);
            edit.setBirthday(birthday);
            edit.setPhone(phone);
        } catch (Exception ex) {
            System.out.println("Invalid Input. Please try again");
        }
        return c;
    }
    public void viewCustomers(ArrayList c) {
        int id = 0;
        System.out.println("--- The List Of Customers ---");
        Iterator cus = c.iterator();
        while(cus.hasNext()) {
            Object obj = cus.next();
            if(obj instanceof Customers) {
                id++;
                Customers list=(Customers) obj;
                System.out.println("Customer ID: " + id + " ");
                System.out.println("Customer Name: " + list.getName() + " ");
                System.out.println("Customer Email: " + list.getEmail() + " ");
                System.out.println("Customer Address: " + list.getAddress() + " ");
                System.out.println("Customer Birthday: " + list.getBirthday() + " ");
                System.out.println("Customer Phone: " + list.getPhone());
                System.out.println("\t");
            }
        }
    }
    public ArrayList deleteCustomers(ArrayList c){
        System.out.print("Please input the Customer ID that you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int idtodelete = scanner.nextInt() - 1;
            scanner.nextLine();
            System.out.println("You want to remove the customers have ID " + (idtodelete + 1));
            c.remove(idtodelete);
        }
        catch(Exception ex) {
            System.out.println("Invalid Input. Please try again");
        }
        return c;

    }
    public Customers() {
        super();
    }
}

