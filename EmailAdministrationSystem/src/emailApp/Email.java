package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive the first and last name

    public Email(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        System.out.println("Email created for : " + this.firstName + " " + this.lastName);

        // call method asking for department - return department
        this.department = setDepartment();
        System.out.println("Department set to : " + department + " successfully!");
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase()
                + ".company.com";

        this.password = randomPassword(8);

    }

    // Ask for the department

    private String setDepartment() {
        System.out.print(
                "Department codes : \n1 for Sales \n2 for Dev \n3 for Accounting \n0 for None \nEnter Department Code : ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        in.close();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Dev";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "null";
        }
    }

    // Generate a random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity

    public void mailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email

    public void alternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public String getEmail() {
        return email;
    }

    public int getMilboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public void getInfo() {
        System.out.println("Display Name : " + firstName + " " + lastName);
        System.out.println("Email : " + getEmail());
        System.out.println("Department : " + this.department);
        System.out.println("Alternate Email : " + getAlternateEmail());
        System.out.println("Mailbox Capacity : " + getMilboxCapacity());
        System.out.println("Password : " + getPassword());
    }
}