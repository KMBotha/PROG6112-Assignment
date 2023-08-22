import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public static ArrayList<StudentData> students = new ArrayList<>();
    public static boolean saveStudent(){
        Scanner input = new Scanner(System.in);

        System.out.print("CAPTURE A NEW STUDENT"
        + "\n*********************************");

        System.out.print("\nEnter the student ID: ");
        String id = input.nextLine();

        System.out.print("Enter the student name: ");
        String name = input.nextLine();

        System.out.print("Enter the student age: ");
        int age = Integer.parseInt(input.nextLine());
        if (age < 16){
            System.out.print("You have entered a incorrect age!!!"
            + "\nPlease re-enter the student age >>");
            age = Integer.parseInt(input.nextLine());
        }

        System.out.print("Enter the student email: ");
        String email = input.nextLine();

        System.out.print("Enter the student course: ");
        String course = input.nextLine();

        StudentData student = new StudentData(id, name, email, course, age);
        students.add(student);

        System.out.print("Details successfully captured.");
        System.out.print("Enter (1) to launch menu or any other key to exit.");
        String exit = input.nextLine();

        return exit.equals("1");
    }

    public static boolean searchStudent(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a student id to search: ");
        String idSearch = input.nextLine();
        System.out.print("\n-----------------------------------------");

        boolean contains = false;
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId().contains(idSearch)){
                contains = true;
            } else{
                contains = false;
            }

            if (contains = true){
                System.out.print("\nSTUDENT ID: " + students.get(i).getId());
                System.out.print("\nSTUDENT NAME: " + students.get(i).getFirstName());
                System.out.print("\nSTUDENT AGE: " + students.get(i).getAge());
                System.out.print("\nSTUDENT EMAIL: " + students.get(i).getEmail());
                System.out.print("\nSTUDENT COURSE: " + students.get(i).getCourse());
            }
            else {
                System.out.print("\nStudent with Student Id: " + idSearch + " was not found!");
            }
        }

        System.out.print("\nEnter (1) to launch menu or any other key to exit.");
        String exit = input.nextLine();

        return exit.equals("1");
    }

    public static void deleteStudent(){

    }

    public static void studentReport(){

    }

    public static void exitStudentApplication (){

    }

}
