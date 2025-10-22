package nivel1;

import java.util.Scanner;

public class UndoView {
    private final Scanner sc = new Scanner(System.in);

    public void printMenu() {
        printMessage("""
                \n1. Add command
                2. Undo last command
                3. Show command history
                4. Exit
                Choose an option: """);
    }

    public String readInput() {
        return sc.nextLine().trim();
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }

    public String askCommand() {
        System.out.print("Enter a command: ");
        return sc.nextLine().trim();
    }
}
