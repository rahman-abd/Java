import java.util.Scanner;

public class StaticStudentManagement {
    static int[] ids = new int[100];
    static String[] names = new String[100];
    static int[] ages = new int[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent() {
        if (count >= 100) {
            System.out.println("Student limit reached.");
            return;
        }
        System.out.print("Enter ID: ");
        ids[count] = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        names[count] = sc.nextLine();
        System.out.print("Enter Age: ");
        ages[count] = sc.nextInt();
        count++;
        System.out.println("Student added.");
    }

    static void viewStudents() {
        if (count == 0) {
            System.out.println("No students available.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + ids[i] + ", Name: " + names[i] + ", Age: " + ages[i]);
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (ids[i] == searchId) {
                System.out.println("ID: " + ids[i] + ", Name: " + names[i] + ", Age: " + ages[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int deleteId = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (ids[i] == deleteId) {
                // Shift all elements left
                for (int j = i; j < count - 1; j++) {
                    ids[j] = ids[j + 1];
                    names[j] = names[j + 1];
                    ages[j] = ages[j + 1];
                }
                count--;
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
