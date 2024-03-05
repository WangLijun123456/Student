import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        
        while (true) {
            System.out.print("Enter Student ID: ");
            String studentID =in.nextLine();

            System.out.print("Enter Student Name: ");
            String studentName = in.nextLine();

            System.out.print("Enter the number of extra activities: ");
            int numExtraActivities = in.nextInt();
           in.nextLine(); 

            // Create a new Student object
            Student student = new Student(studentID, studentName, numExtraActivities);

            // Add extra activities
            student.addExtraActivity(numExtraActivities);

            // Display student details
            System.out.println("\nStudent Details:\n" + student);

            // Ask the user if they want to enter details for another student
            System.out.print("\nDo you want to enter details for another student? (yes/no): ");
            String response = in.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                break;
            }
        }

       in.close();
        
    }
}
