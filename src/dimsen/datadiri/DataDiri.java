package dimsen.datadiri;

import java.util.Scanner;

public class DataDiri {
    public String firstName, lastName, phoneNumber, university;
    public int age;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("PERSONAL DATA PROGRAM");
        System.out.println("Input");
        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("University: ");
        university = scanner.nextLine();
    }

    public void output(){
        System.out.println();
        System.out.println("Output");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("University: " + university);
    }
}
