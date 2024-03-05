import java.util.Scanner;

public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    // Getter and Setter 
    public String getStudentID() {
        return studentID;
    }

    

    // Getter and Setter 
    public String getStudentName() {
        return studentName;
    }

    
    // Getter and Setter 
    public String[] getExtraActivities() {
        return extraActivities;
    }

    

    // Method to add extra activities
    public void addExtraActivity(int numActivities) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numActivities; i++) {
            System.out.print("Enter extra activity #" + (i + 1) + ": ");
            extraActivities[i] = in.nextLine();
        }
        in.close();
    }

    // toString() method to display student details
   
    public String toString() {
        StringBuilder result = new StringBuilder("Student ID: " + studentID + "\n");
        result.append("Student Name: " + studentName + "\n");
        result.append("Extra Activities: ");
        for (String activity : extraActivities) {
            result.append(activity).append(", ");
        }
        
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }
    
}

