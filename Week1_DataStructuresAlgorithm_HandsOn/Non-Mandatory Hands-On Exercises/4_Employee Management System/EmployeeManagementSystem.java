import java.util.Scanner;
public class EmployeeManagementSystem {
    static Employee[] employees = new Employee[100];
    static int count = 0;
    public static void addEmployee(int id, String name, String position, double salary) {
        employees[count++] = new Employee(id, name, position, salary);
        System.out.println("Employee added successfully.");
    }
    public static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employee records.");
            return;
        }
        System.out.println("Employee List:");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    public static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addEmployee(101, "Sanjai", "HR", 50000);
        addEmployee(102, "John", "Developer", 40000);
        addEmployee(103, "Mani", "Analyst", 35000);

        displayAllEmployees();

        System.out.println("\nSearching for Employee ID 102:");
        searchEmployee(102);

        System.out.println("\nDeleting Employee ID 101:");
        deleteEmployee(101);

        System.out.println("\nFinal Employee List:");
        displayAllEmployees();
    }
}
