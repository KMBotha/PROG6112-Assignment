import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        boolean run = true;
        do {
            Scanner menu = new Scanner(System.in);
            System.out.println("STUDENT MANAGEMENT APPLICATION" +
                    "\n***************************" +
                    "\nEnter (1) ro launch menu or any other key to exit");
            int input = Integer.parseInt(menu.nextLine());
            if (input == 1) {

                System.out.println("Please select one of the following menu items:"
                        + "\n(1) Capture a new student."
                        + "\n(2) Search for a student."
                        + "\n(3) Delete a student."
                        + "\n(4) Print student report."
                        + "\n(5) Exit Application.");
                int menuOption = Integer.parseInt(menu.nextLine());

                if (menuOption == 1){
                    Student.saveStudent();
                } else if (menuOption == 2) {
                    Student.searchStudent();
                } else if (menuOption == 3) {
                    Student.deleteStudent();
                } else if (menuOption == 4) {
                    Student.studentReport();
                } else if(menuOption == 5) {
                    run = false;
                }
                else {
                    System.out.print("Please enter a valid option");
                    menuOption = Integer.parseInt(menu.nextLine());
                }

            }
            else{
                run = false;
            }


        } while (run);
    }
}