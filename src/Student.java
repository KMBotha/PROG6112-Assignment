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
        StudentData student = new StudentData();

        System.out.print("Enter a student id to search: ");
        String idSearch = input.nextLine();
        System.out.print("\n-----------------------------------------");

        boolean contains = false;
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId().contains(idSearch)){
                contains = true;
                student = students.get(i);
            } else{
                contains = false;
            }
        }
        System.out.print(searchMessage(contains, student, idSearch));

        System.out.print("\nEnter (1) to launch menu or any other key to exit.");
        String exit = input.nextLine();

        return exit.equals("1");
    }

    public static String searchMessage(boolean containsId, StudentData student, String input){
        String message;
        for(int i = 0; i < students.size(); i++){
            if (containsId){
                message = "\nSTUDENT ID: " + students.get(i).getId()
                        + "\nSTUDENT NAME: " + students.get(i).getFirstName()
                        + "\nSTUDENT AGE: " + students.get(i).getAge()
                        + "\nSTUDENT EMAIL: " + students.get(i).getEmail()
                        + "\nSTUDENT COURSE: " + students.get(i).getCourse();
            }
            else{
                message = "\nStudent with Student Id: " + input + " was not found!";
            }
        }

        return message;
    }

    public static void deleteStudent(){

    }

    public static void studentReport(){

    }

    public static void exitStudentApplication (){

    }

}
