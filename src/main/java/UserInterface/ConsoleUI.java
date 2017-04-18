package UserInterface;

import UserInteraction.ConsoleInteraction;
import UserInteraction.Interaction;

public class ConsoleUI implements UI {
    Interaction interaction;

    public ConsoleUI(ConsoleInteraction interaction) {
        this.interaction = interaction;
    }

    void prinfMenu() {
        System.out.println("You can choose next Queries: ");
        System.out.println("[1]  Count Of Rows on DataBase");
        System.out.println("[2]  Find Name Of Employee");
        System.out.println("[3]  Find Job of Employee ");
        System.out.println("[4]  Delete Employee");
        System.out.println("[5]  Quit");
        System.out.print("Write number there: ");
    }

    public void run() {
        while (true) {
            System.out.println();
            prinfMenu();
            int selection = interaction.getIntParam();
            switch (selection) {
                case 1:
                    interaction.NullParam(selection);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    System.out.println("Please, write id Employee there");
                    interaction.OneIntParam(selection);
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    System.out.println("Please, write job id of Employee there");
                    interaction.OneIntParam(selection);
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    System.out.println("Please, write id Employee there");
                    interaction.OneIntParam(selection);
                case 5:
                    return;
                default:
                    System.out.println("Unfortunately, I don't understood your choice =(");
                    System.out.println(" ");
            }
        }
    }
}
