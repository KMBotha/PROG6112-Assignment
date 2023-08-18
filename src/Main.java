import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean run = true;
        do {
            int input = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION" +
                    "\n***************************" +
                    "\nEnter (1) ro launch menu or any other key to exit"));
            if (input == 1) {

                int menu = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:"
                    + "\n(1) Capture a new student."
                    + "\n(2) Search for a student."
                    + "\n(3) Delete a student."
                    + "\n(4) Print student report."
                    + "\n(5) Exit Application."));

            }
            else{
                run = false;
            }

        } while (run);
    }
}